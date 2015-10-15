public class Test {
	public static void main(String[] args) {
		Animal animal = new Cow();
		//System.out.println(animal.toString());
		System.out.println(talk(animal));

		animal = new Cat();
		//System.out.println(animal.toString());
		System.out.println(talk(animal));

		animal = new Pig();
		//System.out.println(animal.toString());
		System.out.println(talk(animal));
	}

	public static String talk(Animal a) {
		if (a instanceof Cow) {
			return "I am a " + a.kind + " and I go " + a.speak();
		} else if (a instanceof Cat) {
			return "I am a " + a.kind + " and I go " + a.speak();
		}else if (a instanceof Pig) {
			return "I am a " + a.kind + " and I go " + a.speak();
		} else {
			return "I don't know what I am";
		}
	} 
}	
