package array;

import java.util.Scanner;

public class SwapIndex {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i <arr.length; i++) {
            arr[i]=scanner.nextInt();
        }

        swapIndex(arr,1,3);

        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    static void swapIndex(int arr[],int x,int y)
    {
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
}
