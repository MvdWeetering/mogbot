package codebase;

public class time {

	public static String GetTime(String timezone) {

		String time = null;

		java.util.TimeZone tz = java.util.TimeZone.getTimeZone(timezone);
		java.util.Calendar c = java.util.Calendar.getInstance(tz);

		String Hours = String.valueOf(c.get(java.util.Calendar.HOUR_OF_DAY));

		String Minutes = String.valueOf(c.get(java.util.Calendar.MINUTE));

		int minLength = Minutes.length();
		if (minLength == 1) {
			Minutes = "0" + Minutes;
		}

		String Seconds = String.valueOf(c.get(java.util.Calendar.SECOND));

		int secLength = Seconds.length();
		if (secLength == 1) {
			Seconds = "0" + Seconds;
		}

		time = timezone + ": " + Hours + ":" + Minutes + ":" + Seconds;

		return time;

	}

	public static void main(String[] args) {

		System.out.println(GetTime("America/Chicago"));
	}
}
