package org.example;

//create a class of person with the properties of name, age, eye color, and height
public class Person {
    private String name;
    private int age;
    private String eyeColor;
    private double height;

    //create a constructor for the class
    public Person(String name, int age, String eyeColor, double height) {
        this.name = name;
        this.age = age;
        this.eyeColor = eyeColor;
        this.height = height;
    }

    //create a method to print the person's name
    public void printName() {
        System.out.println("Name: " + name);
    }

    //create a method to print the person's age
    public void printAge() {
        System.out.println("Age: " + age);
    }

    //create a method to print the person's eye color
    public void printEyeColor() {
        System.out.println("Eye Color: " + eyeColor);
    }

    //create a method to print the person's height
    public void printHeight() {
        System.out.println("Height: " + height);
    }

    //create a method to print all the person's information
    public void printAll() {
        printName();
        printAge();
        printEyeColor();
        printHeight();
    }
}