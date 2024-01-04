package problemSolving.fundamentals;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner aScanner=new Scanner(System.in);
        char ch=aScanner.next().charAt(0);
        if(ch>='A' && ch<='Z')
        {
            System.out.println(1);
        }
        else if (ch>='a' && ch<='z') {
            System.out.println(0);
        }
        else{
            System.out.println(-1);
        }

    }
}
