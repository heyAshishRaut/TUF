// THEORY CONTENT - DATA TYPES

import java.util.*;

public class Q_02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter primitive data types (Ex - int, ch, boolean, float, double, byte, long, short) - ");
        String str = s.nextLine();

        System.out.println("1 byte = 8 bits");
        switch (str) {
            case "int":
                System.out.println("4 bytes");
                break;
            case "ch":
                System.out.println("2 bytes");
                break;
            case "boolean":
                System.out.println("-- 1 BIT --");
                break;
            case "float":
                System.out.println("4 bytes");
                break;
            case "double":
                System.out.println("8 bytes");
                break;
            case "short":
                System.out.println("2 bytes");
                break;
            case "long":
                System.out.println("8 bytes");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }
}
