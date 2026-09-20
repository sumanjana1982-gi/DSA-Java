public class reverse{
    public static void RE(int a[]){
        int n=a.length;
        for(int i=0;i<n/2;i++){
            int temp=a[i];
            a[i]=a[n-i-1];
            a[n-1-i]=temp;
        }
    }
    public static void main(String arg[]){
        int a[]={1,2,3,4,5,6,7};
        RE(a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }       
    }
}