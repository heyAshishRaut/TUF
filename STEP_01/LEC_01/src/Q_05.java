// THEORY CONTENT - ARRAYS AND STRINGS

import java.util.*;
public class Q_05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("1. Array - 2. String (word) - 3. String (sentence)");
        int num = s.nextInt();

        if(num == 1) {
            System.out.println("Enter array size - ");
            int size = s.nextInt();
            int[] ar = new int[size];

            for(int i = 0; i < ar.length; i++) {
                System.out.println("Enter element at index - " + i);
                ar[i] = s.nextInt();
            }

            System.out.println("Array - " + Arrays.toString(ar));
        }
        else if(num == 2) {
            System.out.println("Enter string (word)");
            String str = s.next();

            System.out.println("String (word) - " + str);
            System.out.println("String length - " + str.length());
        }
        else {
            s.nextLine(); // 💡 clear leftover newline
            System.out.println("Enter string (sentence)");
            String str = s.nextLine();

            System.out.println("String (sentence) - " + str);
            System.out.println("String length - " + str.length());
        }
    }
}
