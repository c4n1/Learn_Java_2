package Interfaces;

interface Animal {
    public void eat();
    public void makeSound();
}

class Cat implements Animal {
    public void makeSound() {
        System.out.println("Meow");
    }
    public void eat() {
        System.out.println("omnomnom");
    }
}

class Run {
    public static void main(String[] args) {
        Animal c1 = new Cat();
        c1.eat();
    }
}