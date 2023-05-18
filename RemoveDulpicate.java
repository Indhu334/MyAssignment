package week2.day2;

public class RemoveDulpicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,1,2};
		
     for(int i=0;i<arr.length;i++) 
     {
    	 int  Count=0;
    	
    	 for(int j=i+1;j<arr.length;j++) 
    	 {
    		 if(arr[i]==arr[j])
    		 {
    	 
    		 Count++;
    	 }
    	 }
    	 
    	 if(Count==0) 
    	 {
    		 System.out.println(arr[i]);
    	 }
    	 
    	 
     }
	}

}

