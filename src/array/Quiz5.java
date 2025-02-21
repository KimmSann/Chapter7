package array;

public class Quiz5 {

	public static void main(String[] args) {
		
		int[] arr = new int[] { 5, 20, 100, 30, 77 };
		
		int cnt =arr [0];
		
		for(int i = 1; i < 5; i++) {
			
			System.out.println(arr[i] + " vs" + cnt);
			
			if(arr[i] > cnt) {
				cnt = arr[i];
			}
			System.out.println("??" + cnt);
			System.out.println();
		}
	}

}
