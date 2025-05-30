package Recursion.Medium;

public class CoinPermutation {

    public static void Permutation(int[] coin, int amount, String ans) {
        if(amount == 0) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < coin.length; i++) {
            if(amount >= coin[i]) {
                Permutation(coin, amount-coin[i], ans+coin[i]);
            }
        }
    }
    public static void main(String[] args) {
        int[] coin = {2,3,5};
        int amount = 8;
        Permutation(coin, amount, "");
    }
}
