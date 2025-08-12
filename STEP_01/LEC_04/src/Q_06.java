/*
PRINT DIVISORS
You are given an integer n. You need to find all the divisors of n.
Return all the divisors of n as an array or list in a sorted order.
A number which completely divides another number is called its divisor.

Examples:
Input: n = 6
Output = [1, 2, 3, 6]
Explanation: The divisors of 6 are 1, 2, 3, 6.

Input: n = 8
Output: [1, 2, 4, 8]
Explanation: The divisors of 8 are 1, 2, 4, 8.
*/
import java.util.*;

public class Q_06 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        ArrayList<Integer> a = new ArrayList<>();

        for(int i = 1; i * i <= n; i++) {
            if(n % i == 0) {
                a.add(i);
                if(i != n / i) {
                    a.add(n / i);
                }
            }
        }
        int []ans = new int[a.size()];
        for(int i = 0; i < ans.length; i++) {
            ans[i] = a.get(i);
        }
    }
}
