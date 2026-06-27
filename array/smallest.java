public class smallest{
    public static int SM(int a[]){
        int sm=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]<sm){
                sm=a[i];
            }
        }
        return sm;
    }
    public static void main(String arg[]){
        int a[]={1,4,5,6,3,7,8,90,0};
        int r=smallest.SM(a);
        System.out.print("smallest in the given array is "+r);
    }
}