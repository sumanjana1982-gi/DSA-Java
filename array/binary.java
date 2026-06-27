public class binary{
    public static int BS(int a[],int k){
        int mid,low ,high;
        low =0;high=a.length-1;
        while(low<=high){
            mid=(low+high)/2;
            if(a[mid]==k){
                return mid;
            }
            else if(a[mid]<k){
                low=mid +1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
    public static void main(String arg[]){
        int a[]={1,3,5,7,9,11};
        int k=3;
        int r=binary.BS(a,k);
        if(r==-1){
            System.out.print(k+"not found");
        }else{
            System.out.print(k+"founded at idex "+r);
        }
    }
}