package example_constructor_chaining.example0_blob;

public class ImplicitCall {

	public static void main(String[] args) {
		SuperBlob sb = new SuperBlob();

	}
}

class Blob {
	int status;
	public Blob() {
		status=0;
	}
}

class SuperBlob extends Blob {
	int strength;
	public SuperBlob() {
		super();
		strength=10;
	}
}

