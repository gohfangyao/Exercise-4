
import java.util.Scanner;

public class TestMyStaffQ4 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        String name, ID;
        double totalHours, totalSales;

        System.out.print("Name: ");
        name = sc.nextLine();
        System.out.print("Staff ID: ");
        ID = sc.nextLine();
        System.out.print("Working Hours: ");
        totalHours = sc.nextDouble();
        System.out.print("Total Sales: RM ");
        totalSales = sc.nextDouble();

        MyFCStaff m = new MyFCStaff(name,ID,totalHours,totalSales);
        System.out.println(m.toString());
    }
}

class MyFCStaff{
    private String name, ID;
    private double totalHours, totalSales, totalSalary, commission;

    public MyFCStaff(String name, String ID,double totalHours,double totalSales){
        this.name = name;
        this.ID = ID;
        this.totalHours = totalHours;
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
        totalSalary = totalHours * 8 + calculateCommission();
        return totalSalary;
    }

    public String toString(){
        String info1,info2,info3,info4,info5;
        String str1="%-10s%-2s%s\n";
        String str2="%-10s%-2s%.2f\n";
        String str3="%-10s%-2s%.0f\n";
        
        System.out.println();
        info1=String.format(str1,"Staff Name",":",name);
        info2=String.format(str1,"Staff ID",":",ID);
        info3=String.format(str3,"Hours Work",":",totalHours);
        info4=String.format(str2,"Total Sale",": RM ",totalSales);
        info5=String.format(str2,"Total Salary",": RM ",calculateSalary());
  
        return info1+info2+info3+info4+info5;
    }
}
