package array;

import java.util.Arrays;

public class Quiz4 {
	
	public static void main(String[] args) {
		
		int [] arr = new int[5];
		
//		System.out.println(Arrays.toString(arr));
		
		int cnt = 0;
		
		
		for(int i = 1; i<= 10; i++) {
			if(i% 2 == 0) {
				arr[cnt] = i;
				cnt++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
