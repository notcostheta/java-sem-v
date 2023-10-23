package slip5;

/* Slip5 - Write programs in Java to sort i) List of integers ii) List of names. The objective of this assignment is to learn Arrays and Strings in Java*/

import java.util.*;

class Demo_Array {
    int a[];
    int n;

    void accept() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of integers: ");
        n = scanner.nextInt();
        a = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
    }

    void display() {
        System.out.println("\nList of Integers:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

    void sort() {
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
}

class Demo_String {
    String a[];
    int n;

    void accept() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of names: ");
        n = scanner.nextInt();
        a = new String[n];
        System.out.println("Enter " + n + " names:");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.next();
        }
    }

    void display() {
        System.out.println("\nThe List of Names:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

    void sort() {
        String temp;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i].compareTo(a[j]) > 0) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
}

public class Slip5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1: List of Integers");
            System.out.println("2: List of Names");
            System.out.println("3: Exit");
            System.out.print("Enter Choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Demo_Array da = new Demo_Array();
                    da.accept();
                    System.out.println("\nDisplay Before Sort");
                    da.display();
                    da.sort();
                    System.out.println("\nDisplay After Sort");
                    da.display();
                    break;
                case 2:
                    Demo_String ds = new Demo_String();
                    ds.accept();
                    System.out.println("\nDisplay Before Sort");
                    ds.display();
                    ds.sort();
                    System.out.println("\nDisplay After Sort");
                    ds.display();
                    break;
            }
        } while (choice != 3);
    }
}
