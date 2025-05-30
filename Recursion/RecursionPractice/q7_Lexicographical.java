package Recursion.RecursionPractice;

public class q7_Lexicographical {
    public static void LexicoGraphical(int n,int curr) {
        
        if(curr > n) {
            return;
        }
        System.out.println(curr);
        int i = 0;
        if(curr == 0) {
            i = 1;
        }
        for (; i <= 9; i++) {
            LexicoGraphical(n,curr*10+i);
        }
    }
    public static void main(String[] args) {
        int n = 1000;
        LexicoGraphical(n, 0);
    }           
}
