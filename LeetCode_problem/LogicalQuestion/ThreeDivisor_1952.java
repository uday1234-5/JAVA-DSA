package Leetcode.LogicalQuestion;

public class ThreeDivisor_1952 {
    public static boolean isThree(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
            if (count > 3) {
                return false;
            }
        }
        return count == 3;
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(isThree(n));
    }
}
