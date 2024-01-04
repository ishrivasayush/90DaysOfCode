package problemSolving.fundamentals;

public class SwitchCase {
    public static int dataTypes(String type) {
        switch(type){
            case "Integer": return 4;
            case "Long": return 8;
            case "Float": return 4;
            case "Double": return 8;
            case "Character": return 1;
        }
        return 0;

    }
}
