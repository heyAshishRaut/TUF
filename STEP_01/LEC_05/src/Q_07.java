public class Q_07 {
    public int fibonacci(int num) {
        if(num == 0 || num == 1) {
            return num;
        }
        else {
            return fibonacci(num - 1) + fibonacci(num - 2);
        }
    }
    public static void main(String[] args) {
        Q_07 o = new Q_07();
        int ans = o.fibonacci(3);
        System.out.println(ans);
    }
}
