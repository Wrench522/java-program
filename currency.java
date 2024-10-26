import java.io.*;
import java.util.Scanner;

public class currency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter USD Currency : ");
        double currency = sc.nextDouble();

        double usd = 129.7;
        double result = currency * usd;

        System.out.println("The Amount is SH." + result);
    }
}
