import java.util.Scanner;
class TestMyStaff {
	static Scanner sc = new Scanner(System.in);	
   public static void main(String arg[]){
	
	String name, staffID;
	int workingDay;

	System.out.print("Staff name: ");
		name = sc.next();

   System.out.print("Staff ID: ");
      staffID = sc.next();
   
   System.out.print("How many days of work: ");
   	workingDay = sc.nextInt();
   
   double salary = workingDay * 35.0;
   
   System.out.print("Name: "+ name);
   System.out.print("ID: "+ staffID);
   System.out.print("Working days: "+ workingDay);
   System.out.printf("Salary: %.2f", salary);
   
   }	
}
