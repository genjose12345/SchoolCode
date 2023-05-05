package example_equals_person;

public class Employee extends Person {
	public Employee(String name, int ssn) {
		super(name, ssn); 
	}
	
	public String toString() {
		return "Emp:" + name + ", " + ssn;
	}


	
}

 

