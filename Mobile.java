package week1.day1;

public class Mobile {
	public void shareDocument(){
		System.out.println("shareDocument");
	}
	public void sendMessage() {
		System.out.println("sendMessage");
		
	}
	public void makeCall() {
		System.out.println("makeCall");
	}
      public static void main(String[]args){
    	  Mobile phone=new Mobile();
    	  phone.makeCall();
    	  phone.sendMessage();
    	  phone.shareDocument();
    			  
    			  
      }
}
   
