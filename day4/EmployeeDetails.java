package week1.day4;

public class EmployeeDetails {
public void employeeId(int a) {
	System.out.println("EmployeeId:"+a);
}
public void employeeName(String name) {
	System.out.println("Name:"+name);
	
}
public void employeeAddress(String address) {
	System.out.println("Address:"+address);
}
public void employeePhoneNumber(long a) {
	System.out.println("MobileNumber:"+a);
}
public void employeeSalary(double a) {
	System.out.println("Salary:"+a);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDetails indhu = new EmployeeDetails();
		indhu.employeeName("indhu");
		indhu.employeeAddress("Salem");
		indhu.employeePhoneNumber(234567894L);
		indhu.employeeSalary(3500);
		indhu.employeeId(786);

	}

}
