//import javax.swing.*;
import java.util.Scanner;

class Employee2{

    private int empId;
    private String name;
    private int salary;

    Employee2(){
        System.out.println("Default constructor called");
        this.empId=0;
        this.name="";
        this.salary=0;

    }
    Employee2(int empId)
    {
        this.empId=empId;
    }

    public void displayEmployeeDetails(){
        System.out.println("Employee details are");
        System.out.println("Name :- "+name+"\nEmp Id :- "+empId+"\nSalary :- "+salary);
    }

    public void acceptEmployeeDetails(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name");
        name=sc.next();
        System.out.println("Enter Salary");
        salary=sc.nextInt();
    }
    public int getEmpId()
    {
        return empId;
    }
}
public class Assignment_1 {
    public static void main(String[] args){
        Employee2[] emp= new Employee2[5];
        int i;
        for(i=0;i<5;i++){
            emp[i]=new Employee2(i);
            emp[i].acceptEmployeeDetails();
        }

        for(i=0;i<5;i++){
                emp[i].displayEmployeeDetails();

        }
        /*
        JOptionPane inp=new JOptionPane();
        int empId=Integer.parseInt(inp.showInputDialog("enter empid"));
*/
        System.out.println("Enter empId to search");
        Scanner sc=new Scanner(System.in);
        int empId=sc.nextInt();
        for(i=0;i<5;i++){
            if(emp[i].getEmpId()==empId){
                emp[i].displayEmployeeDetails();
                break;
            }

        }
        if(i==5){
            System.out.println("No result found");
        }


    }
}


