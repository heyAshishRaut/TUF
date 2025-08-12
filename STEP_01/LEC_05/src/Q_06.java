/*
PALINDROME STRING
*/

public class Q_06 {
    public boolean isPalindrome(String str, int start, int size) {
        if(start >= size / 2) {
            return true;
        }
        if(str.charAt(start) != str.charAt(size - 1 - start)) {
            return false;
        }
        return isPalindrome(str, start + 1, size);
    }

    public static void main(String[] args) {
        Q_06 o = new Q_06();

        String str = "aabbaaa";
        boolean ans = o.isPalindrome(str, 0, str.length());
        System.out.println(ans);
    }
}
