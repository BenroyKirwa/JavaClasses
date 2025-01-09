import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
abstract class Employees {
    String Employee_Number, Employee_Name;
    double Net_Salary;
    Scanner scanner = new Scanner(System.in);

    abstract void calculateSalary();

    public void  displayEmployeeDetails(){
        System.out.print("The Employee name is : " + Employee_Name);
        System.out.print("The Employee number is : " + Employee_Number);
    }
}

class FullTimeEmployee extends Employees{
    void calculateSalary(){
        System.out.print("What is your gross salary? ");
        double gross_salary = scanner.nextDouble();
        Net_Salary = gross_salary * 0.7;
        System.out.print("Your net salary as a full-time employee is : " + Net_Salary);
    }
}

class PartTimeEmployee extends Employees{
    void calculateSalary(){
        System.out.print("What is your gross salary? ");
        double gross_salary = scanner.nextDouble();
        Net_Salary = gross_salary * 0.7;
        System.out.print("Your net salary as a part-time employee is : " + Net_Salary);
    }
}

public class Main {
    public static void main(String[] args){
        FullTimeEmployee F = new FullTimeEmployee();
        F.calculateSalary();
        System.out.print("\n");
        PartTimeEmployee P = new PartTimeEmployee();
        P.calculateSalary();
    }
}