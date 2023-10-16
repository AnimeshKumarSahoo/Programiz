package DSA;
import java.util.Scanner;
    class Student {
        public int regno;
        int dob;
        public String name,branch;
        Student( String name,int regno,int dob,String branch)
        {
            this.name = name;
            this.regno=regno;
            this.dob=dob;
            this.branch=branch;
        }
        public void display()
        {
            System.out.println();
            System.out.println();
        }
    }
    public class Studentdetails {
        public static void main(String args[]){
            Student ob[]=new Student[5];
            ob[0]=new Student("Animesh", 456, 123, "csit");
            ob[1]=new Student("Anish", 45, 12, "cse");
            ob[2]=new Student("Alok", 567, 678, "ME");
            ob[3]=new Student("Amit", 890, 234, "CE");
            ob[4]=new Student("Ajit", 467, 879, "EE");
            for(int i=0;i<ob.length;i++){
                System.out.println("Name:"+ob[i].name+"\n"+"Reg no:"+ob[i].regno+"\n"+"Date of birth:"+ob[i].dob+"\n"+"Branch:"+ob[i].branch);
            }
            }
        }
    

