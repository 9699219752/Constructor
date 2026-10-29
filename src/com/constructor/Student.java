
package com.constructor;

public class Student {

    int id;
    String name;
    int age;

    Student(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }

    public static void main(String[] args) {

        Student s1 = new Student(101, "Bhagyshri", 21);
        Student s2 = new Student(102, "Pooja", 22);

        s1.display();
        s2.display();
    }
}
