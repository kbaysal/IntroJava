
public class Driver {

	public static void main(String[] args) {
		Dog d = new Dog();
		Cat c = new Cat();
		Driver.makeAnimalSound(d);
		Driver.makeAnimalSound(c);
	}
	
	private static void makeAnimalSound(AbstractAnimal a) {
		a.makeSound();
	}

}
