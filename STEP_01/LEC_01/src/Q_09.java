// THEORY CONTENT - TIME COMPLEXITY

public class Q_09 {
    public static void main(String[] args) {
        int[] ar = {10, 20, 30};

        // O(1)
        System.out.println(ar[0]);

        // O(n)
        for(int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
        System.out.println( );
    }
}
