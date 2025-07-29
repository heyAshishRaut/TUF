/*
PALINDROME

Input:N = 4554
Output:Palindrome Number

Input:N = 7789
Output: Not Palindrome
*/

import java.util.*;

public class Q_03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter number - ");
        int num = s.nextInt();
        int num_copy = num;
        int rev = 0;
        while(num > 0) {
            int reminder = num % 10;
            rev = rev * 10 + reminder;
            num = num / 10;
        }

        if(num_copy == rev) {
            System.out.println("It's a palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
}
