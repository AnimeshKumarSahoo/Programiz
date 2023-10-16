package DSA;
import java.util.Scanner;
class Employee{
double salary;
int hours;
public void getInfo(double salary,int hours)
{
this.salary=salary;
this.hours=hours;
}
public void AddSal(double salary)
{
if(salary < 500)
salary = salary + 10;
System.out.println("Salary: " + salary);
}
public void AddWork(double salary,int hours)
{
if(hours > 6)
salary =salary + 5;
System.out.println("Salary: " + salary);
}
public class Employeedetails {
public static void main(String args[])
{
Scanner in = new Scanner(System.in);
Employee obj = new Employee();
System.out.println("Enter the employee details");
System.out.println("Enter your salary");
double salary = in.nextDouble();
System.out.println("Enter the no.of working hours");
int hours = in.nextInt();
obj.getInfo(salary,hours);
obj.AddSal(salary);
obj.AddWork(salary,hours);
}
}
}

    

