package array;

import java.util.Scanner;

public class RotateArrayKTimes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give Size Of An Array:");
        int n = scanner.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter The Value Of K: ");
        int k = scanner.nextInt();

        rotateArray(arr,0, n-1);
        rotateArray(arr,0, k-1);
        rotateArray(arr,k, n-1);


        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static void rotateArray(int arr[], int x, int y) {
        int start = x;
        int end = y;
        while (start<end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
