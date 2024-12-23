package JAVArebound; // package name should be lowercase

// Interface representing the abstraction of an Animal
interface Animal {
    void walk();
}

// Interface representing the abstraction of a Herbivore
interface Herbivore {
    void eatGrass();
}

// Horse class implementing both Animal and Herbivore interfaces (demonstrating multiple inheritance through interfaces)
class Horse implements Animal, Herbivore {
    public void eatGrass() {
        System.out.println("Horse is eating grass");
    }

    public void walk() {
        System.out.println("Horse can walk.");
    }
}

public class Abstract2 {
    public static void main(String[] args) { // Standard main method signature
        Horse horse = new Horse();
        horse.walk();
        horse.eatGrass();
    }
}
