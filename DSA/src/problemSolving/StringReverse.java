package problemSolving;

public class StringReverse {
    public static void main(String[] args) {
        /*
      Approach 1
      String s="Ayush";
      StringBuilder stringBuilder=new StringBuilder(s);
        StringBuilder reverse = stringBuilder.reverse();
        System.out.println(reverse);

      */

        String str= "Geeks for Geeks", nstr="";
        char ch;


        for (int i=0; i<str.length(); i++)
        {
            ch= str.charAt(i); //extracts each character
            nstr= ch+nstr; //adds each character in front of the existing string
        }
        System.out.println("Reversed word: "+ nstr);

        /*
        String input = "Geeks For Geeks";
        char[] temparray = input.toCharArray();
        int left, right = 0;
        right = temparray.length - 1;

        for (left = 0; left < right; left++, right--) {
            // Swap values of left and right
            char temp = temparray[left];
            temparray[left] = temparray[right];
            temparray[right] = temp;
        }

        for (char c : temparray)
            System.out.print(c);
        System.out.println();

         */
    }
}
