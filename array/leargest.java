public class leargest{
    public static int LA(int a[]){
        int larg=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]>larg){
            larg=a[i];
            }
        }
        return larg;
    }
    public static void main(String arg[]){
        int a[]={1,3,4,5,6,7,89,9,};
       int result= leargest.LA(a);
       System.out.print("largest in the given array is "+result);
    }
}