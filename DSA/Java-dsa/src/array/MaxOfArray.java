package array;

import java.util.Scanner;

public class MaxOfArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i <arr.length; i++) {
            arr[i]=scanner.nextInt();
        }

        System.out.println(max(arr));

        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static int max(int arr[])
    {
        int max=Integer.MIN_VALUE;
        for(int x:arr)
        {
            if (x>max)
            {
                max=x;
            }
        }
        return max;
    }
}
