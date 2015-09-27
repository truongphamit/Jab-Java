public class ClockTime {
	private int hour;
	private int minute;
	private String amPm;

	public ClockTime(int h, int m, String ap) {
		hour = h;
		minute = m;
		amPm = ap;
	}

	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}

	public String getAmPm() {
		return amPm;
	}

	public void increase(int m) {
		int totalMinute;
		if (amPm == "AM") {
			totalMinute = hour * 60 + minute + m;
		} else {
			totalMinute = (hour + 12) * 60 + minute + m;
		}
		amPm = "AM";
		hour = totalMinute / 60;
		if (hour > 24) {
			hour = hour % 24;
			if (hour > 12) {
				hour = hour % 12;
				amPm = "PM";
			}
		} else {
			hour = hour % 12;
			amPm = "PM";
		}

		minute = totalMinute % 60;
	}

	@Override
	public String toString() {
		return hour + ":" + minute + " " + amPm;
	}
}