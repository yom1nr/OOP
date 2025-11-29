package week08.lab.lab2;

public class MainClass {
    public static void main(String[] args) {

        Dog dog = new Dog("Buddy");
        Cat cat = new Cat("Kitty");

        System.out.println("Animal and their sounds: ");
        System.out.println("---------------------------");
        dog.makeSound();
        cat.makeSound();
    }
}