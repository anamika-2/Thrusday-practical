import java.util.Scanner;
public class Array_of_Sum {
        public static void main(String[] args) {
            int arr[] = new int[5];
            int sum = 0;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the array Element");
            for(int i=0;i<arr.length;i++){
                arr[i] = sc.nextInt();
            }

            System.out.println("Array Element");
            for(int i=0;i<arr.length;i++){
                sum = sum + arr[i];
            }
            System.out.println("Sum of Array Element " + sum);
        }
    }