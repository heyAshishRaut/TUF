public class Q_04 {
    public int fact(int num) {
        if(num == 1) {
            return 1;
        }
        else {
            return fact(num - 1) * num;
        }
    }
    public static void main(String[] args) {
        Q_04 o = new Q_04();
        System.out.println(o.fact(5));
    }
}
