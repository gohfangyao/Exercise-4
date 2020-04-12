import java.util.Scanner;

public class TestMyStaffQ3 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        String name, staffID;
        double totalHoursWork, totalSales;

        System.out.print("Name: ");
        name = sc.nextLine();
        System.out.print("Staff ID: ");
        staffID = sc.nextLine();
        System.out.print("Working Hours: ");
        totalHoursWork = sc.nextDouble();
        System.out.print("Total Sales: ");
        totalSales = sc.nextDouble();

        MyStaff m = new MyStaff(name,staffID,totalHoursWork,totalSales);
        m.Salary();
    }
}

class MyStaff{
    private String name, staffID;
    private double totalHoursWork, totalSales, totalSalary, commission;

    public MyStaff(String name, String staffID,double totalHoursWork,double totalSales){
        this.name = name;
        this.staffID = staffID;
        this.totalHoursWork = totalHoursWork;
        this.totalSales = totalSales;
    }

    public double calculateCommission(){
        if(totalSales>=150 && totalSales<=300){
            commission = totalSales * 0.05;
        }else if(totalSales>=301 && totalSales<=500){
            commission = totalSales * 0.1;
        }else if(totalSales>500){
            commission = totalSales * 0.15;
        }else{
            commission = 0;
        }
        return commission;
    }

    public double calculateSalary(){
        totalSalary = totalHoursWork * 8 + calculateCommission();
        return totalSalary;
    }

    public void Salary(){
    	System.out.print("------------------------------------------------");
        String info1="%-10s%-2s%s\n";
        String info2="%-10s%-2s%.2f\n";
        String info3="%-10s%-2s%.0f\n";
        
        System.out.println();
        System.out.printf(info1,"Staff Name",":",name);
        System.out.printf(info1,"Staff ID",":",staffID);
        System.out.printf(info3,"Hours Work",":",totalHoursWork);
        System.out.printf(info2,"Total Sale",": RM ",totalSales);
        System.out.printf(info2,"Total Salary",": RM ",calculateSalary());
    }
}
