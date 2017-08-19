import java.util.*;
class Employee{

    private int empId;
    private String name;
    private int salary;

    Employee(){
        System.out.println("Default constructor called");
        this.empId=0;
        this.name="";
        this.salary=0;

    }
    Employee(int empId){
        System.out.println("Parameterised constructor called");
        this.empId=empId;
    }

    public void displayEmployeeDetails(){
        System.out.println("Employee details are");
        System.out.println("Name :- "+name+"\nEmp Id :- "+empId+"\nSalary :- "+salary);
    }

    public void acceptEmployeeDetails(int salary1){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name");
        this.name=sc.next();
        this.salary=salary1;
        /*

        JOptionPane inp=new JOptionPane();
        this.empId=Integer.parseInt(inp.showInputDialog("enter empid"));
        this.name=inp.showInputDialog("enter name");
        this.salary=Integer.parseInt(inp.showInputDialog("enter salary"));
        */

    }

}
public class Assignment_2 {
    public static void main(String[] args){
        Employee[] emp= new Employee[5];
        for(int i=0;i<5;i++){
            emp[i]=new Employee(i);
            emp[i].acceptEmployeeDetails(100);
        }
        for(int i=0;i<5;i++){
            emp[i].displayEmployeeDetails();
        }


    }
}
