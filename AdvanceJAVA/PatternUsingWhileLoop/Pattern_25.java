package AdvanceJAVA.PatternUsingWhileLoop;

public class Pattern_25 {
    public static void main(String[] args) {
        int n = 5;
        int star = 1;
        int space = n-1;
        int row = 1;
        int val = 1;
        while(row <= n) {
            int i = 1;
            while(i <= space) {
                System.out.print("   ");
                i++;
            }
            int j = 1;
            while(j <= star) {
                System.out.printf("%2d",val);

                System.out.print(" ");
                val++;
                j++;
            }

            System.out.println();
            row++;
            space--;
            star += 2;

        }

    }
}
