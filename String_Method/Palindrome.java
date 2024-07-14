package String_Method;

public class Palindrome {
    public static boolean checkPalindrome(String str) {
        int n = str.length();
        for (int i = 0; i < n/2; i++) {
            if(str.charAt(i) != str.charAt(n-i-1)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "rac ecar";
        if(checkPalindrome(str)){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}