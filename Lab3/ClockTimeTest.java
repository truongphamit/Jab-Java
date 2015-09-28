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
		
		ClockTime t0 = new ClockTime(0, 45, "AM"); // false
		System.out.println(t0.isWorkTime());
		ClockTime t1 = new ClockTime( 6, 02, "AM"); // false
		System.out.println(t1.isWorkTime());
		ClockTime t2 = new ClockTime( 8, 59, "AM"); // false
		System.out.println(t2.isWorkTime());
		ClockTime t3 = new ClockTime( 9, 00, "AM"); // true
		System.out.println(t3.isWorkTime());
		ClockTime t4 = new ClockTime(11, 38, "AM"); // true
		System.out.println(t4.isWorkTime());
		ClockTime t5 = new ClockTime(0, 53, "PM"); // true
		System.out.println(t5.isWorkTime());
		ClockTime t6 = new ClockTime( 3, 15, "PM"); // true
		System.out.println(t6.isWorkTime());
		ClockTime t7 = new ClockTime( 4, 59, "PM"); // true
		System.out.println(t7.isWorkTime());
		ClockTime t8 = new ClockTime( 5, 00, "PM"); // true
		System.out.println(t8.isWorkTime());
		ClockTime t9 = new ClockTime( 5, 01, "PM"); // false
		System.out.println(t9.isWorkTime());
	}
}
