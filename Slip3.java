/* Slip3 - Write a program in Java with class Rectangle with the data fields width, length, area and colour. The length, width and area are of double type and colour is of string type. The methods are get_length(), get_width(), get_colour() and find_area(). Create two objects of Rectangle and compare their area and colour. If the area and colour both are the same for the objects then display "Matching Rectangle", otherwise display "Non-matching Rectangle"  */

package slip3;

import java.util.*;

class Rectangle {
    double length, width, area;
    String colour;

    void setValue(double length, double width, String colour) {
        this.length = length;
        this.width = width;
        this.colour = colour;
        this.area = length * width; // Calculate and set the area when setting values.
    }

    String get_colour() {
        return colour;
    }

    double find_area() {
        return area;
    }
}

public class Slip3 {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
			Rectangle r1 = new Rectangle();
			Rectangle r2 = new Rectangle();

			double len, wd;
			String col;

			System.out.println("Enter length, width, color for the first Rectangle = ");
			len = s.nextDouble();
			wd = s.nextDouble();
			col = s.next();
			r1.setValue(len, wd, col);

			System.out.println("Enter length, width, color for the second Rectangle = ");
			len = s.nextDouble();
			wd = s.nextDouble();
			col = s.next();
			r2.setValue(len, wd, col);

			if (r1.find_area() == r2.find_area() && r1.get_colour().equals(r2.get_colour())) {
			    System.out.println("Matching Rectangle");
			} else {
			    System.out.println("Non-Matching Rectangle");
			}
		}
    }
}
