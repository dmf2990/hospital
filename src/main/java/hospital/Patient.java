package hospital;

public class Patient {
	private int health;
	private int bloodLevel;
	private int hunger;
	private String name;
	private String idNumber;
	private String stats;

	private final static int HEALTH_LEVEL = 10; // default inti health level -- final sets value in stone (immutable)
	private final static int BLOOD_LEVEL = 20; // default inti blood level -- final sets value in stone (immutable)
	private final static int HUNGER = 10; // default inti hunger level -- final sets value in stone (immutable)

	public int getHealth() {
		return health;
	}
	
	public int getBloodLevel() {
		return bloodLevel;
	}
	
	public int getHunger() {
		return hunger;
	}
	
	public String getName() {
		return name;
	}
	
	public String getIdNumber() {
		return idNumber;
	}
	public String getStats() {
		return "Patient name=" + name + "\nidNumber=" + idNumber + "\nhealth=" + health + "\nbloodLevel=" + bloodLevel + "\nhunger=" + hunger;

	}
	
	public Patient(String name, String idNumber) {
		health = HEALTH_LEVEL;
		bloodLevel = BLOOD_LEVEL;
		hunger = HUNGER;
		this.name = name;
		this.idNumber = idNumber;
	}

	// Decreases blood by int specified in perspective class
	// See lines 53-55 in Doctor Class
	public void drawSomeBlood(int bloodLevel) {
		bloodLevel -= bloodLevel;
	}

	// Increases health by int specified in perspective class
	// See lines 47-49
	public void treatCurrentPatient(int healthAfterTreatingPatient) {
		health -= healthAfterTreatingPatient;
	}

	public void performSurgery(int healthAfterSurgery, int bloodLevelAfterSurgery) {
		health += healthAfterSurgery;
		bloodLevel -= bloodLevelAfterSurgery;
	}

	public void satisfyHunger(int hungerAfterFeed) {
		hunger += hungerAfterFeed;
	}

	@Override
	public String toString() {
		return "Patient name=" + name + "\nidNumber=" + idNumber + "\nhealth=" + health + "\nbloodLevel=" + bloodLevel + "\nhunger=" + hunger;
	}

	public String stats() {
		return "Patient name=" + name + "\nidNumber=" + idNumber + "\nhealth=" + health + "\nbloodLevel=" + bloodLevel + "\nhunger=" + hunger;
	}

	public void tick() {
		health -= 1;
		bloodLevel -= 1;
		hunger -= 1;
	}
}
	
