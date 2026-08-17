import java.util.Scanner;
public class Array{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr = new int[5];
        System.out.println("Enter the Array elements: ");
        for(int i=0;i<arr.length-1;i++){
           arr[i]=sc.nextInt();
        }    
        System.out.println("The elements of the array are");
        for(int j = 0; j < arr.length; j++){
            System.out.println(arr[j]);
        }
    }
}