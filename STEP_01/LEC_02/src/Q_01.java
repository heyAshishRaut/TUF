// THEORY CONTENT

public class Q_01 {
    public static void main(String[] args) {
        int size = 6;
        // BUILD A HOLLOW SQUARE (6 * 6)
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                if(i == 0 || j == 0 || j == size - 1 || i == size - 1) {
                    System.out.print("*  ");
                }

                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
