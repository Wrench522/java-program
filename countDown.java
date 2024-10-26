import java.io.*;
import java.util.Scanner;

public class countDown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to start the countdown : ");
        int number = sc.nextInt();

        for (int i = number; i >= 0; i--) {
            System.out.println(i);
        }

        sc.close();
    }

}
