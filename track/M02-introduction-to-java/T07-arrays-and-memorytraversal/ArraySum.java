import java.util.Scanner;
public class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[6];
        System.out.println("Enter Array elemnets:");
        for(int i=0;i<arr.length-1;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array Elements are:");
        for(int i=0;i<arr.length-1;i++){
            System.out.println(arr[i]);
        }
        int sum = 0;
        for(int i=0;i<arr.length-1;i++){
            sum = sum+arr[i];
        }
        System.out.println();
        System.out.println("Sum of array elements is: "+sum);
    }
}
