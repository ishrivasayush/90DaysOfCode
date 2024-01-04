package problemSolving.fundamentals;

public class AreaSwitchCase {
    public static double areaSwitchCase(int ch, double []a) {
        switch(ch)
        {
            case 1: return (a[0]*a[0]*3.14159265359);

            case 2: return (a[0]*a[1]);

            default:
                return 0;
        }
    }
}
