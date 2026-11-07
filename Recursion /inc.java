public class inc{
    public static void inc(int n,int k){
        if(n==k){
            System.out.print(k+" ");
            return;    
        }
        System.out.print(n+" ");
        inc(n+1,k);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter a number  :");
        int k=sc.nextInt();
        inc(1,k);}
        
}