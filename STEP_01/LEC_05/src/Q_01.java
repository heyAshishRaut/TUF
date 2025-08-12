public class Q_01 {
    public void print1toN(int num) {
        if(num == 0) {
            return;
        }
        else{
            print1toN(num - 1);
            System.out.println(num);
        }
    }
    public static void main(String[] args) {
        Q_01 obj = new Q_01();

        obj.print1toN(5);
    }
}
