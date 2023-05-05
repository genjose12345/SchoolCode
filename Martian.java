package exercise_martian_equals;

public class Martian {
	private int wavelength;
	private int elevation;
	
	public Martian(int wavelength, int elevation) {
		this.wavelength = wavelength;
		this.elevation = elevation;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof Martian) {
			Martian m = (Martian)o;
			return this.wavelength==m.wavelength &&
					this.elevation==m.elevation;
		}
		return false;
	}

	@Override
	public String toString() {
		String msg = String.format("wavelengh=%d, elevation=%d", wavelength, elevation);
		return msg;
	}
}
