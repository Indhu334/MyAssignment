package week1.day4;

public class Calculator {
	public void addThreeNumber(int a,int b){
		
		int c=a+b;
		System.out.println(c);
		
	}
public void subThreeNumber(int e,int f){
		
		int d=e-f;
		System.out.println(d);
	
}
public void multipleTwoNumber(double i,double j) {
	double h=i*j;
	System.out.println(h);
	
}
public void divideTwoNumber(float x,float y) {
	float z=x/y;
	System.out.println(z);
}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Calculator calc = new Calculator();
        calc.addThreeNumber(2,4);
        calc.subThreeNumber(8, 5);
        calc.multipleTwoNumber(3.781,2.986);
        calc.divideTwoNumber(33.2F, 99.3F);
        
        

	}

}
