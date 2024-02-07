package array;

import java.util.Scanner;

public class MinOfArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i <arr.length; i++) {
            arr[i]=scanner.nextInt();
        }

        System.out.println(min(arr));

        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static int min(int arr[])
    {
        int min=Integer.MAX_VALUE;
        for(int x:arr)
        {
            if (x<min)
            {
                min=x;
            }
        }
        return min;
    }
}
