package array;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println(arr[5]);
		System.out.println(arr[6]);
		System.out.println(arr[7]);
		System.out.println(arr[8]);
		System.out.println(arr[9]);
		
		for(int i = 0; i< 10; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("배역의 크기: "+ arr.length);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println( arr[i]);
		}
	}

}
