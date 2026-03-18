// Program demonstrating instanceof operator

class Animal {}

class Dog extends Animal {}

public class InstanceOfOperator {

    public static void main(String[] args) {

        Dog d = new Dog();

        System.out.println(d instanceof Dog);
        // object belongs to Dog class
        // result: true

        System.out.println(d instanceof Animal);
        // Dog inherits Animal
        // result: true

        System.out.println(d instanceof Object);
        // every class inherits Object
        // result: true
    }
}