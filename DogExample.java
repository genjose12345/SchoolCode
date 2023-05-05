package example_superclass_method_dog_wolfdog;

public class DogExample {
	  public static void main(String[] args) {
			WolfDog wd = new WolfDog("Mocho", 4, 9);
			System.out.println(wd);
		}
}

class Dog {
	  protected String name;
	  protected int age;

	  public Dog(String name, int age) {
	    this.name = name;
	    this.age = age;
	  }

	  @Override
	  public String toString() {
	    return "name=" + name + 
	           ", age=" + age;
	  }
}

class WolfDog extends Dog {
	  private int toughness;
		
	  public WolfDog(String name, int age, 
	          int toughness) {
	    super(name, age);
	    this.toughness = toughness;
	  }

	  @Override
	  public String toString() {
	    return super.toString() + 
	              ", toughness=" + toughness;
	  }
	}


