import java.util.Scanner;
public class printdc{
    public static void printdec(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        System.out.print(m+" ");
        printdec(n-1);
    }
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
     System.out.println("Enter a number :");
      int n=sc.nextInt();
      printdec(n);
    }
}