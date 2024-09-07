/* 
                                1 
                              1 2 1
                            1 2 3 2 1
                          1 2 3 4 3 2 1
                        1 2 3 4 5 4 3 2 1
 */

package AdvanceJAVA.PatternUsingWhileLoop;

import java.util.Scanner;

public class Pattern_33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        int n = 5;
        int space = n-1;
        int star = 1;
        int row = 1;
        while (row <= n) {
            int i = 1;
            while (i <= space) {
                System.out.print("  ");
                i++;
            }
            int val = 1;
            int j = 1;
            while (j <= star) {
                System.out.print(val+" ");
                if(j <= star/2) val++;
                else val--;

                j++;
            }

            System.out.println();
            star += 2;
            space--;
            row++;
        }
        sc.close();
    }
}