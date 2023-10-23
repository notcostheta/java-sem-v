package slip9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

interface Shape {
    float pi = 3.14f;

    void area();
}

class Circle implements Shape {
    private int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    public void area() {
        System.out.println("Area of Circle = " + (pi * radius * radius));
    }
}

class Sphere implements Shape {
    private int radius;

    Sphere(int radius) {
        this.radius = radius;
    }

    public void area() {
        System.out.println("Area of Sphere = " + (4 * pi * radius * radius));
    }
}

public class Slip9 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int radius;

        System.out.print("Enter radius for Circle: ");
        radius = Integer.parseInt(br.readLine());

        Shape circle = new Circle(radius);
        circle.area();

        System.out.print("Enter radius for Sphere: ");
        radius = Integer.parseInt(br.readLine());

        Shape sphere = new Sphere(radius);
        sphere.area();
    }
}
