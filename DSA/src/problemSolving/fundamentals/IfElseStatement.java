package problemSolving.fundamentals;

public class IfElseStatement {
    public static String compareIfElse(int a, int b) {
        if (a<b) {
            return "smaller";
        }
        else if (a>b) {
            return "greater";
        }
        else
        {
            return "equal";
        }
    }
}
