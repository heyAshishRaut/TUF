import java.util.Arrays;

public class Q_05 {
    public void calcReverseArray(int []ar, int start, int size) {
        if(start >= size / 2) {
            System.out.println(Arrays.toString(ar));
            return;
        }
        else {
            int val = ar[start];
            ar[start] = ar[size - 1 - start];
            ar[size - 1 - start] = val;
            calcReverseArray(ar, start + 1, size);
        }
    }

    public void reverseArray(int []ar, int size) {
        int start = 0;
        calcReverseArray(ar, start, size);
    }

    public static void main(String[] args) {
        Q_05 o = new Q_05();

        int []ar = {1, 2, 3, 4, 5};
        o.reverseArray(ar, 5);
    }
}
