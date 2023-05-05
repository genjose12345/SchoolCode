package example_equals_person;

public class Person {
	protected int ssn;
	protected String name;
	
	public Person(String name, int ssn) { 
		this.ssn = ssn;
		this.name = name;
	}

	@Override
	public boolean equals(Object o) {
		if(o instanceof Person) {
			Person p = (Person)o;
			return this.ssn == p.ssn;
		}
		return false;
	}

	// Other version in notes
	public boolean equals2(Object o) {
		if(o instanceof Person) {
			Person p = (Person)o;
			if(this.ssn == p.ssn) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}

	// Other version in notes
	public boolean equals4(Object o) {
		if(o instanceof Person) {
			Person p = (Person)o;
			return (this.ssn == p.ssn) && 
				   (this.name.equals(p.name));
		}
		return false;
	}
	
	@Override
	public String toString() {
		return name + ", " + ssn;
	}
}

 

