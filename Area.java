import java.util.Scanner;

public class Area {
  public static void main(String[] args) {

    Scanner keyboardInput = new Scanner(System.in);

    System.out.print("What's your friend's name ? :");
    String name = keyboardInput.nextLine();

    System.out.print("How old is she ? : ");
    String age = keyboardInput.nextLine();

    System.out.print("where does she live ? : ");
    String live = keyboardInput.nextLine();

    System.out.print("When is her Birthday ? : ");
    String ID = keyboardInput.nextLine();

    System.out.println(" Good things take time ... : ");
    String confirm = keyboardInput.nextLine();
    System.out.println("|");
    System.out.println("|");
    System.out.println("All the best in knowing your friend  " + name);

  }
}