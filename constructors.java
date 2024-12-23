package JAVArebound;
import java.util.Scanner;

class Student{
    String Name;
    String age;
    
    Student(String name,int age){
        this.Name=name;
        this.age=String.valueOf(age);
    }
    public void printInfo(){
        System.out.println("Yo Bitch!!!");
    }
    
}
public class constructors {
    
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    Student s1 = new Student("Sahil",19);

    s1.printInfo();
    sc.close();
}
}
