// print number from N to 1.

public class recursion {
    public static void onetoN(int n){
        if(n==0){
            return;
        }
        onetoN(n-1);
        System.out.print(n);
    }
public static void main(String arg[]){
     onetoN(5);
}}