public class ClockTimeTest {
	public static void main(String[] args) {
		ClockTime time = new ClockTime(6, 27, "PM");
		System.out.println(time);
		String str = time.toString();
		System.out.println(str); 

		time.increase(30); // 6:58 PM
		System.out.println(time);
		time.increase(5); // 7:03 PM
		System.out.println(time);
		time.increase(60); // 8:03 PM
		System.out.println(time);
		time.increase(128); // 10:11 PM
		System.out.println(time);
		time.increase(180); // 1:11 AM
		System.out.println(time);
		time.increase(1440); // 1:11 AM (1 day later)
		System.out.println(time);
		time.increase(21075); // 4:26 PM (2 weeks later)
		System.out.println(time);
	}
}