public class Q_02 {
    public void printNto1(int num) {
        if(num == 0) {
            return;
        }
        else{
            System.out.println(num);
            printNto1(num - 1);
        }
    }
    public static void main(String[] args) {
        Q_02 obj = new Q_02();

        obj.printNto1(5);
    }
}
