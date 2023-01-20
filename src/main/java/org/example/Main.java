package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //create a new person object
        Person person1 = new Person("John", 25, "Blue", 6.2);
        Person person2 = new Person("Jane", 23, "Green", 5.8);
        Person person3 = new Person("Jack", 27, "Brown", 6.0);
        person1.printAll();
        person2.printAll();
        person3.printAll();

    }
}