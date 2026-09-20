import java.util.*;
public class selection{
    public static void main(String arg[]){
        int a[]={5,2,3,6,7,1,4};
        for(int i=0;i<a.length;i++){
            int min=i;
            for(int j=i+1;j<a.length;j++){
                if(a[min]>a[j]){
                   min=j;
                }
            }
             int temp=a[min];
                    a[min]=a[i];
                    a[i]=temp;
            
        }
        //print
            for(int i=0;i<a.length;i++){
                System.out.print(a[i]+" ");
            }
    }
}