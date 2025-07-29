/*
ARMSTRONG NUMBER
Example 1:
Input:N = 153
Output:True
Explanation: 13+53+33 = 1 + 125 + 27 = 153

Example 2:
Input:N = 371
Output: True
Explanation: 33+53+13 = 27 + 343 + 1 = 371
*/

import java.util.*;

public class Q_05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter number - ");
        int num = s.nextInt();
        int num_copy = num;

        int power = Integer.toString(num).length();
        int ans = 0;

        while(num_copy > 0) {
            int reminder = num_copy % 10;
            ans = ans + (int)Math.pow(reminder, power);
            num_copy = num_copy / 10;
        }

        if(num == ans) {
            System.out.println("It's a armstrong");
        }
        else{
            System.out.println("Not a armstrong");
        }
    }
}
