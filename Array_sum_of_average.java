import java.util.Scanner;
public class Array_sum_of_average {
    public static void main(String[] args) {
        int arr[] = new int[7];
        int sum = 0;
        float avg;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array Element");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Array Element");
        for(int i=0;i<arr.length;i++){
            sum = sum + arr[i];
        }
        avg = sum/arr.length;
        System.out.println("average of array " + avg);
    }
}