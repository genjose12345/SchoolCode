package exercise_list_of_lists_of_blobs;

import java.util.ArrayList;
import java.util.Arrays;

public class BlobTest {

	public static void main(String[] args) {
		
		ArrayList<Blob> blobs1 = new ArrayList<>(Arrays.asList(
				new Blob(2), new Blob(8), new Blob(6)));
		ArrayList<Blob> blobs2 = new ArrayList<>(Arrays.asList(
				new Blob(9), new Blob(4)));
		ArrayList<Blob> blobs3 = new ArrayList<>(Arrays.asList(
				new Blob(2), new Blob(8), new Blob(2), new Blob(3)));
		
		ArrayList<ArrayList<Blob>> blobs = new ArrayList<>();
		blobs.add(blobs1);
		blobs.add(blobs2);
		blobs.add(blobs3);
		
		ArrayList<Blob> blobsMaster = concatenateBlobList(blobs);
		
		System.out.println(blobsMaster);
		
	}
	
	public static ArrayList<Blob> concatenateBlobList(ArrayList<ArrayList<Blob>> blobs) {
		ArrayList<Blob> blobsReturn = new ArrayList<>();
		for(ArrayList<Blob> bs : blobs) {
			blobsReturn.addAll(bs);
		}
		return blobsReturn;
	}

}
