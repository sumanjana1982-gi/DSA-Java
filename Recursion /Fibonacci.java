public class Fibonacci{
    public static int  fibo(int n){
       // int t1=0;int t2=1;int sum=0;
       if(n==0){
        return 0;
       } if(n==1) return 1;
        return fibo(n-1)+fibo(n-2);
    }
    public static void main(String arg[]){
     System.out.print(fibo(4));
    }
}