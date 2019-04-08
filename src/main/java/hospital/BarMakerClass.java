package hospital;

public class BarMakerClass {

	public static String barMaker(int stat) {
		String littleSpaces;
		int activeBars = Math.round(stat / 75);
		int inactiveBars = 20 - activeBars;
		int percent = Math.round(stat / 15);
		String littleTicks = new String(new char[activeBars]).replace("\0", "-");

		if (inactiveBars <= 0) {
			littleSpaces = "";
		} else {
			littleSpaces = new String(new char[inactiveBars]).replace("\0", " ");
		}
		String statusBar = "|" + littleTicks + littleSpaces + "| " + percent + "%";
		return statusBar;
	}

}
