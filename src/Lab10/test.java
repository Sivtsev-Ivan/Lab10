package Lab10;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cat cat = new Cat();
        Dog dog = new Dog();

        System.out.println("Dog run:");
        dog.run(sc.nextFloat());
        System.out.println("\nCat run:");
        cat.run(sc.nextFloat());
        System.out.println("\nDog swim:");
        dog.swim(sc.nextFloat());
        System.out.println("\nCat swim:");
        cat.swim(sc.nextFloat());
        System.out.println("\nDog jump:");
        dog.jump(sc.nextFloat());
        System.out.println("\nCat jump:");
        cat.jump(sc.nextFloat());
    }
}
