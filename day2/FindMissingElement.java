package week1.day2;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		int array[]= {1,4,3,2,8,6,7};
		Arrays.sort(array);
        for(int i=1;i<array.length;i++) {
        
        	if(array[i]+1!= array[i+1]) {
        		
        	System.out.println("Missing Number is "+ (array[i]+1));
        		break;
        	}


	}
	}
}
	

