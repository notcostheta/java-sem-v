/*Slip2 - Write a program in Java to implement a Calculator with simple arithmetic operation such as add, substract, multiply, divide, factorial etc. using switch case and other simple java statements. The objective of this assignment is to learn Constants, Variables and Data types, Operators and Expressions, Decision making statements in Java*/

package slip2;

import java.util.Scanner;

class Slip2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch, i, a, b, fact;

        do {
            System.out.println("1 : Add");
            System.out.println("2 : Sub");
            System.out.println("3 : Mul");
            System.out.println("4 : Div");
            System.out.println("5 : Factorial");
            System.out.println("6 : Exit");
            System.out.print("Enter Choice = ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Enter 2 numbers = ");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    System.out.println("Add = " + (a + b));
                    break;
                case 2:
                    System.out.println("Enter 2 numbers = ");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    System.out.println("Sub = " + (a - b));
                    break;
                case 3:
                    System.out.println("Enter 2 numbers = ");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    System.out.println("Mul = " + (a * b));
                    break;
                case 4:
                    System.out.println("Enter 2 numbers = ");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    if (b == 0) {
                        System.out.println("Error: Division by zero is not allowed.");
                    } else {
                        System.out.println("Div = " + ((float) a / b));
                    }
                    break;
                case 5:
                    System.out.println("Enter number = ");
                    a = sc.nextInt();
                    fact = 1;
                    for (i = 1; i <= a; i++)
                        fact = fact * i;
                    System.out.println("Factorial = " + fact);
                    break;
            }
        } while (ch != 6);
        sc.close();
    }
}
