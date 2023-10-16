import java.util.ArrayList;
import java.util.Scanner;
public class Student {
    String name;
    int age,roll;
    Student(){
        this.name=name;
        this.age=age;
        this.roll=roll;
}
public void set(){
    Scanner sc=new Scanner(System.in);
System.out.println("Enter the name ");
name=sc.nextLine();
System.out.println("Enter the age");
int age=sc.nextInt();
System.out.println("Enter the roll no");
int roll=sc.nextInt();
}
public void get(){
System.out.println("Name of the student is:"+name);
System.out.println("Age of the student is:"+age);
System.out.println("Roll of the student is:"+roll);
}
        public static void main (String args[]){
            Scanner sc=new Scanner(System.in);
            Student ob[]=new Student[3];
            ob[0]=new Student();
            ob[1]=new Student();
            ob[2]=new Student();
            ob[0].set();
            ob[0].get();
            ob[1].set();
            ob[1].get();
            ob[2].set();
            ob[2].get();
            
            
        }
            }


        
            

    

