/*
REVERSE DIGITS OF A NUMBER
Input:N = 12345
Output:54321

Input:N = 7789
Output: 9877
*/

import java.util.*;

public class Q_02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter number - ");
        int num = s.nextInt();

        int rev = 0;
        while(num > 0){
            int reminder = num % 10;
            rev = rev * 10 + reminder;
            num = num / 10;
        }
        System.out.println("Reversed number - " + rev);
    }
}
