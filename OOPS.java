package JAVArebound;
import java.util.Scanner;

class Marvel{
    String Hero;
    String Name;

    public void power(){
        System.out.println("With the great power comes great Responsibility");
    }
    public void name(){
        System.out.println(this.Name);
    }
}
class Student{
    String Name;
    int age;

    public void printdetails(){
        System.out.println("Name: "+this.Name);
        System.out.println("Age: "+this.age);
    }
    Student(){
        System.out.println("Yo Bitch!!!");
    }
    // Student(String name,int age){
    //     this.Name=name;
    //     this.age=age;
    // }
    //copy constructor
    Student(Student s2){
        this.Name=s2.Name;
        this.age=s2.age;
    }
}
public class OOPS {
    
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    Student s1 = new Student();
    s1.Name = "Sahil";
    s1.age = 19;
    Student s2 = new Student(s1);
    s2.printdetails();
    sc.close();
}
}