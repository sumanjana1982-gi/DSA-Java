public class onetoN{
    public staic void 1toN(int n){
        if(n==1){
            return;
        }
        1toN(n-1);
        System.out.print(n);
    }
public static void main(String arg[]){
     onetoN(5);
}}