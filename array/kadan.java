public class kadan{
    public static void KADAN(int a[]){
        int ms=Integer. MIN_VALUE;
        int cs=0;
        for(int i=0;i<a.length;i++){
            cs+=a[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs,ms);
        }
        System.out.println("maximum is : "+ ms);
    }
    public static void main(String arg[]){
        int a[]={1,-1,2,5,6,7,8,9,-4,-5,9   };
        KADAN(a);
    }
}