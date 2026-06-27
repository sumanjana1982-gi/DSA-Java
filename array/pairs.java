public class pairs{
    public static void PAIR(int a[]){
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                System.out.print("("+a[i]+","+a[j]+")");
            }
        }
    }
    public static void main(String arg[]){
        int a[]={1,2,3,4,5};
        PAIR(a);
    }
}