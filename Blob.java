package exercise_list_of_lists_of_blobs;

public class Blob {
	int code;
	public Blob(int code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "Blob code=" + code;
	}
}

