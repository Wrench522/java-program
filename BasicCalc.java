import java.io.*;
import java.util.Scanner;

public class BasicCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st NUmber : ");
        double num1 = sc.nextDouble();
        System.out.print("Enter 2nd Number : ");
        double num2 = sc.nextDouble();

        System.out.print("Choose operation(1-4)");
        int operation = sc.nextInt();

        if (operation == 1) {
            double result = num1 + num2;
            System.out.print(num1 + "+" + num2 + "=" + result);

        } else if (operation == 2) {
            double result = num1 - num2;
            System.out.print(num1 + "-" + num2 + "=" + result);

        } else if (operation == 3) {
            double result = num1 * num2;
            System.out.print(num1 + "*" + num2 + "=" + result);

        } else if (operation == 4) {
            if (num2 > 0) {

                double result = num1 / num2;
                System.out.print(num1 + "/" + num2 + "=" + result);
            } else {
                System.out.println("Can't divide by zero");
            }

        } else {
            System.out.println("Try again.Choose operation 1-4");
        }
    }
}
