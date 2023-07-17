package week1.day1;

public class Car {
	public void applyBreak() {
		System.out.println("applyBreak");
	}
	
	public void applyGear() {
		System.out.println("applyGear");
	}
	
	public void switchOnAc() {
		System.out.println("switchOnAc");
	}
	public void applyAcclerate() {
		System.out.println("applyAcclerate");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car Ford=new Car();
		Ford.applyBreak();
		Ford.applyGear();
		Ford.applyAcclerate();
		Ford.switchOnAc();
		

	}

}
