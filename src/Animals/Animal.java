package Animals;

//Superclass Animals
abstract public class Animal {
    protected int legs;
    public void eat() {
        System.out.println("Animal eats");
    }

    public void makeSound () {
        System.out.println("...");
    }
}

class Dog extends Animal {
    Dog() {
        legs = 4;
    }

    public void makeSound () {
        System.out.println("Woof");
    }
}

class Bird extends Animal {
    Bird() {
        legs = 2;
    }

    public void makeSound () {
        System.out.println("Squark");
    }

}
