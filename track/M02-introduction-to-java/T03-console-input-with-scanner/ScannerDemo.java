import java.util.Scanner;
public class ScannerDemo{ 
        public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter byte value:");
        byte a=scan.nextByte();
        System.out.println("Byte value is:"+a);
        
        System.out.println("Enternshort value:");
        short b=scan.nextShort();
        System.out.println("Short value is:"+b);

        System.out.println("Enter int value:");
        int c=scan.nextInt();
        System.out.println("Integer value:"+c);
       
        System.out.println("Enter long value:");
        long d =scan.nextLong();
        System.out.println("Long value is:"+d);
        
        
        System.out.println("Enter double value:");
        double f=scan.nextDouble();
        System.out.println("Double value is:"+f);

    }
}
