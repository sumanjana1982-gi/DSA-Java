public class maximumsub{
    public static void MSa(int a[]){
        int currentSum=0;int MaxSum=a[0];
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                currentSum=0;
                for(int k=i;k<=j;k++){
                    currentSum+=a[k];
                }
                if(MaxSum<currentSum){
                    MaxSum=currentSum;
                }
            }
        }
        System.out.println("Maximum sum of subarray: "+MaxSum);
    }
    public static void main(String arg[]){
        int a[]={1,2,3,4,5};
        MSa(a);
    }
}