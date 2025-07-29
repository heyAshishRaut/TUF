import java.util.Arrays;

// THEORY CONTENT - FUNCTIONS
// NOTE - Java is always pass by value — but for objects, the value being passed is a reference to the object.
class One {
    public int performOperation(int x) {
        return x * 4;
    }

    public void changeArray(int[] ar) {
        ar[0] = 1000;
    }
}

public class Q_08 {
    public static void main(String[] args) {
        // FOR PRIMITIVE DATA TYPES -> PASS BY VALUE
        One obj = new One();

        int x = 10;
        int ans = obj.performOperation(x);

        System.out.println("x - " + x);
        System.out.println("ans - " + ans);

        // FOR OBJECTS -> PASS BY REFERENCE
        int[] ar = {10, 20, 30};
        System.out.println(Arrays.toString(ar));
        obj.changeArray(ar);
        System.out.println(Arrays.toString(ar));
    }
}
