/*
CHECK FOR PRIME NUMBER
*/

import java.util.Scanner;

public class Q_07 {
    public boolean checkPrime() {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        if(num == 1) {
            return false;
        }
        else if(num == 2 || num == 3) {
            return true;
        }
        else if(num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        else {
            for(int i = 5; i * i <= num; i = i + 6) {
                if(num % i == 0 || num % (i + 2) == 0) {
                    return false;
                }
            }
            return true;
        }
    }
    public static void main(String[] args) {
//        a > √num
//        b > √num
//        => a × b > (√num × √num) = num   ❌ (impossible)

    }
}
