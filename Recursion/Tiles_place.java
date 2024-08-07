package Recursion;

public class Tiles_place {
    public static int placeTiles (int n , int m){
        if(n == m){
            return 2;
        }
        if(n < m){
            return 1;
        }
        // vertically 
        int vertPlacements = placeTiles(n-m, m);

        // horizontally
        int horPlacements = placeTiles(n-1, m);
        return vertPlacements+horPlacements;

    }
    public static void main(String[] args) {
        int n = 40;
        int m = 30;
        int TotalWays = placeTiles(n, m);
        System.out.println(TotalWays);
    }
}
