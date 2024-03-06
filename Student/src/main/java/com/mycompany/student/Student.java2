
package com.mycompany.student;
import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private boolean isMinor;

    public Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.isMinor = (age < 18);
    }

    public String getName() {
        return lastName + ", " + firstName;
    }

    public void increaseAge() {
        age++;
        isMinor = (age < 18);
    }

    @Override
    public String toString() {
        String status = isMinor ? "minor" : "adult";
        return lastName + ", " + firstName + " - " + age + " - " + status;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter test case number: ");
        int testCaseNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        Student student = new Student(firstName, lastName, age);

        System.out.print("Test Case " + testCaseNumber + ": ");
        if (age < 18) {
            System.out.println("Student under 18");
        } else if (age == 18) {
            System.out.println("Increase age of student1");
        } else {
            System.out.println("Student over 18");
        }

        System.out.println(student.toString());

        scanner.close();
    }
}
