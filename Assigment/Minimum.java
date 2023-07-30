package Assigment;

public class Minimum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declare an integer array and assign the values
				int[] number = {10,20,13,54,97,};
				
				//declare a variable maxValue 
				int maxValue = Integer.MAX_VALUE;
				//Print the maximum value
				System.out.println(maxValue);
				
				//iterate a for loop from 0 
				for(int i=0;i<number.length-1;i++) {
					//Compare the element in the array to the maxvalue, 
					//if it is lesser, then assign the value of the element to the maxValue variable
					if(number[i]<maxValue) {
				      maxValue = number[i];
				}
					
		}
				//print the value of maxValue
				System.out.println(maxValue);
		}
	}

}
