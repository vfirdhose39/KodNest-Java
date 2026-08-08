import java.util.Scanner;
public class CompletelineandNewline {
      public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          System.out.println("Enter age:");
          int age = scan.nextInt();
          System.out.println("Age is:"+age);
          
          System.out.println("Enter Height:");
          float height=scan.nextFloat();
          System.out.println("Height is:"+height);

          System.out.println("Enter Fullname:");
          String Fullname = scan.nextLine();
          System.out.println("Fullname is:"+Fullname);

        }
}
