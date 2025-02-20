package array;

public class Quiz3 {

	public static void main(String[] args) {
		int[] intArray = new int[]{10,15,20 ,25,30};
		int sum = 0;
		
		for(int i = 1; i<5; i++) {
			sum = sum + intArray[i];
		}
		System.out.println(sum);

	}

}
