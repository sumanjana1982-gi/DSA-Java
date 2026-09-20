import java.util.*;
public class buble{
    public static void main(String arg[]){
        int a[]={5,2,3,6,7,1,4};
       for(int i=0;i<a.length-1;i++){//length-1 :to avoid ArrayIndexOutOfBoundsException....
           for(int j=0;j<a.length-1-i;j++){
              if(a[j]<a[j+1]){
                 int temp=a[j];
                 a[j]=a[j+1];
                 a[j+1]=temp;
              }
           }
       }
       //printing sorted array:
       for(int i=0;i<a.length;i++){//length:to maintain or print all elements
        System.out.print(a[i]+" ");
       }
    }
}