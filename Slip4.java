/*Slip4 - Write a program in JAVA to demonstrate the method and constructor overloading */

class Demo {
    int value1; // Data Members
    int value2;

    // Default Constructor
    Demo() {
        value1 = 10;
        value2 = 20;
    }

    // Parameterized Constructor with one parameter
    Demo(int a) {
        value1 = value2 = a;
    }

    // Parameterized Constructor with two parameters
    Demo(int a, int b) {
        value1 = a;
        value2 = b;
    }

    void display() {
        System.out.println("Value1 = " + value1);
        System.out.println("Value2 = " + value2);
    }
}

public class Slip4 {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        Demo d2 = new Demo(10);
        Demo d3 = new Demo(30, 40);
        d1.display();
        d2.display();
        d3.display();
    }
}
