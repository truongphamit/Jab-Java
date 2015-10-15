public class Bird extends Animal {
	public String makeNoise(int n) {
		String result = "Tweeting: ";
		for (int i = 0; i < n; i++) {
			result += "Tweet!";
		}
		return result;
	}
}