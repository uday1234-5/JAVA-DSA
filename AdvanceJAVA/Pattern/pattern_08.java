/* 
 *                 *
    *           *
       *     *
          *
       *     *
    *           *
 *                 * 
 */
package Super150_Batch.Pattern;
import java.util.Scanner;
public class pattern_08 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if(i == j || i+j == n-1){
                System.out.print(" * ");
            } else {
                System.out.print("   ");
            }
        }
        System.out.println();
    }
    sc.close();
  }
}
