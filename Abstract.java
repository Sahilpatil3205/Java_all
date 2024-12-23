package JAVArebound;
//abstraction method one using abstract keyword
abstract class Animal{
    abstract void walk();
    Animal(){
        System.out.println("We are creating new Animal.");
    }
    public void eats(){
        System.out.println("All can Eat.");
    }
}
class Horse extends Animal{
    Horse(){
        System.out.println("Horse is created.");
    }
    public void walk(){
        System.out.println("Horse can walk.");
    }
}
class Chicken extends Animal{
    Chicken(){
        System.out.println("Chicken is created.");
    }
    public void walk(){
        System.out.println("Chicken can walk and fly also.");
    }
}
public class Abstract {
    public static void main(String args[]){
        Horse horse=new Horse();//first parent class constructor called then derived class
        horse.walk();
    }
}
