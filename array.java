import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int arr[] = new int[5];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array Element");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Array Element");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}