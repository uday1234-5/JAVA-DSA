package Functions;
public class Overloading_types {
    public static int sum(int a, int b){
        return a+b;
    }
    public static float sum(float a, float b){
        return a+b;
    }
    public static void main(String[] args) {
        
        System.out.println(sum(3,4));
        System.out.println(sum(3.4f,4.4f));
    }
}
