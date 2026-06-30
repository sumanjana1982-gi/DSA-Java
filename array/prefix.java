public class prefix{
    public static void PS(int a[]){
        int currentSum=0;int maxSum=a[0];
        int prefix[]=new int [a.length];
        prefix[0]=a[0];
        for(int i=1;i<a.length;i++){
            prefix[i]=prefix[i-1]+a[i];
        }
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                currentSum=i==0? prefix[j]:prefix[j]-prefix[i-1];
                if(maxSum<currentSum){
                    maxSum=currentSum;
                }
            }

        }
        System.out.println("maxsum is "+maxSum);
    }

public static void main (String arg[]){
    int a[]={1,-2,6,-1,3};
    PS(a);
} }