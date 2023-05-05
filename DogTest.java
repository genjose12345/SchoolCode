package example_dog_wolfdog_ver_2;

public class DogTest {

	public static void main(String[] args) {
		
		Dog d = new Dog();
		d.setName("Leo");
		
		WolfDog wd = new WolfDog();
		wd.setName("Zorro");
		
		String name = wd.getName();
		String sound = wd.bark();

		System.out.println(name + " " + sound);
	}

}
