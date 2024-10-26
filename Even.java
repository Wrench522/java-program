import java.io.*;
import java.util.Scanner;

public class Even {

    public static void main(String[] args) {

        Scanner wrench = new Scanner(System.in);

        System.out.print("Enter any number :");
        int num1 = wrench.nextInt();

        if (num1 % 2 == 0) {
            System.out.println(num1 + " is an even number");
        } else {

            System.out.println(num1 + " Is an odd number");

        }
    }
}
