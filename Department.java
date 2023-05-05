package exercise_department_equals;

public class Department {
	private String code;
	private String number;
	
	public Department(String code, String number) {
		this.code = code;
		this.number = number;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof Department) {
			Department d = (Department)o;
			return this.code.equals(d.code) &&
					this.number.equals(d.number);
		}
		return false;
	}

	@Override
	public String toString() {
		String msg = String.format("code=%s, number=%s", code, number);
		return msg;
	}
}
