package slip1;

import java.util.Scanner;

class Slip1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int ch, i, num, n, sum, cnt, flag, fact;
            do {
                System.out.println("1 : Find Factorial");
                System.out.println("2 : Display First 50 numbers");
                System.out.println("3 : Find sum and average of N numbers");
                System.out.println("4 : Exit");
                System.out.print("Enter Choice = ");
                ch = sc.nextInt();
                switch (ch) {
                    case 1:
                        System.out.print("Enter number = ");
                        n = sc.nextInt();
                        fact = 1;
                        for (i = 1; i <= n; i++) {
                            fact *= i;
                        }
                        System.out.println("Factorial = " + fact);
                        break;
                    case 2:
                        cnt = 1;
                        n = 1;
                        while (cnt <= 50) {
                            flag = 1;
                            for (i = 2; i <= n / 2; i++) {
                                if (n % i == 0) {
                                    flag = 0;
                                    break;
                                }
                            }
                            if (flag == 1) {
                                System.out.println(n);
                                cnt++;
                            }
                            n++;
                        }
                        break;
                    case 3:
                        System.out.print("Enter limit = ");
                        n = sc.nextInt();
                        sum = 0;
                        for (i = 1; i <= n; i++) {
                            System.out.print("Enter number  = ");
                            num = sc.nextInt();
                            sum += num;
                        }
                        System.out.println("Sum = " + sum);
                        System.out.println("Avg = " + (float) sum / n);
                        break;
                }
            } while (ch != 4);
        }
    }
}
