import java.util.ArrayList;

public class AnimalLauncher {

	public static void main(String[] args) {

		Wolf wolfie = new Wolf();
		Lion leo = new Lion();
		Cat felix = new Cat();
		Dog rover = new Dog();
		
		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(wolfie);
		animals.add(leo);
		animals.add(felix);
		animals.add(rover);
		
		for (Animal a : animals) {
			System.out.println(a.makeNoise());
			System.out.println(a.sleep());
		}

		Bird bird = new Bird();
		System.out.println(bird.makeNoise(3));
	}
}
	
	

