package Assigment;

public class Dulpicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declare a variable num 
		int[] num = {1,4,5,2,6,2,9,3,5,1};
		
		//iterate a for loop from o to the length of the array
		for(int i=0;i<num.length;i++) {
			//Iterate a nest for loop from iterative element incremented by 1 to the length of the array
			for(int j=i+1;j<num.length;j++) {
				//Compare the  elements in both the arrays, if it is equal print that element
				if(num[i]==num[j]) {
					System.out.println(num[i]);
					
				}
			}
		}


	}

}
