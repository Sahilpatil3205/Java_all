package JAVArebound;
class Learner {
    String name;
    int age;

    public void displayInfo(String name) {
        System.out.println(name);
    }

    public void displayInfo(int age) {
        System.out.println(age);
    }

    public void displayInfo(String name, int age) {
        System.out.println(name);
        System.out.println(age);
    }
}
public class Overloading {
    public static void main(String[] args) {
        Learner s1 = new Learner();
        s1.name = "Sahil";
        s1.age = 19;
        s1.displayInfo(s1.name);
        s1.displayInfo(s1.age);
        s1.displayInfo(s1.name, s1.age);
    }
} 
