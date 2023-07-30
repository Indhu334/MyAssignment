package Assigment;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declare an integer array and assign the values
		int[] num = {1,2,3,4,5,6};
		
		//declare a variable len 
		int len = num.length;
		//print the value of len
		System.out.println(len);
		//iterate a for loop 
		
		for(int i=0;i<num.length;i++) {
		//print the values of the array
			System.out.println(num[i]);
		}
        //print the value of the last element in the array
		System.out.println("last index "+ num[len-1]);
	}

	}

}
