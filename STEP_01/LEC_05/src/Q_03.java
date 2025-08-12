/*
Sum of First N Numbers
*/

public class Q_03 {
    public int calcSum(int num, int sum) {
        if(num == 0) {
            return sum;
        }
        else {
            return calcSum(num - 1, num + sum);
        }
    }

    public int sumOfN(int num) {
        int sum = 0;
        int ans = calcSum(num, sum);
        return ans;
    }
    public static void main(String[] args) {
        Q_03 obj = new Q_03();

        System.out.println(obj.sumOfN(5));
    }
}
