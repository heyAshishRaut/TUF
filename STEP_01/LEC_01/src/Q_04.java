/*
Given the integer day denoting the day number, print on the screen which day of the week it is.
Week starts from Monday and for values greater than 7 or less than 1, print Invalid.

Ensure only the 1st letter of the answer is capitalised.

Input: day = 3
Output: Wednesday

Input: day = 8
Output: Invalid
*/

import java.util.*;

public class Q_04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter day (in no.) - ");
        int day = s.nextInt();

        if(day < 1 || day > 7) {
            System.out.println("Invalid");
        }
        else {
            switch (day) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                default:
                    System.out.println("Sunday");
                    break;
            }
        }
    }
}
