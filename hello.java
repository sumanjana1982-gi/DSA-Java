import java.util.*;
public class hello{
    public static int bubbleSort(int arr[],int n){
       for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(arr[i]>arr[j]){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
       }

        return 0;
    }
    public static int SlectionShort(int arr[],int n){
           
        return 0;
    }
    public static int printarray(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        return 0;}
        public static int InsertionSort(int arr[],int n){
            for(int i=1;i<n;i++){
                int key=arr[i];
                int j=i-1;
                while(j>=0 && arr[j]>key){
                    arr[j+1]=arr[j];
                    j--;}
                arr[j+1]=key;
                }     
           return 0;
    }
    public static int Two_darrayinput(int arr[][],int m,int n){//m=row,n=colume
        Scanner inp=new Scanner (System.in);
               for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    arr[i][j]=inp.nextInt();
                }

               }
               for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
               }
               inp.close();
               return 0;
    }
    public static int diagonalSum(int matrix[][]){
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i==j){
                    sum+=matrix[i][j];
                }
                else if(i+j==matrix.length-1){
                    sum+=matrix[i][j]; 
                }
            }
        }
        return sum;
    }
    public static boolean stairSeach(int arr[][],int key){
        int row=0;
        int col=arr[0].length-1;
        while(row<arr.length && col>=0){
            if(key==arr[row][col]){
                return true;
            }else if(key<arr[row][col]){
                col--;
            }else{
                row++;
            }
          
        }
         return false;
    }
    public static void printletter(String obj){
     int   count=0;
    for(int i=0;i<obj.length();i++){
        System.out.println(obj.charAt(i));
        count++;
    }
    System.out.println("total letter in your name:"+count);
    }
    public static boolean palindrome(String obj){
        int n=obj.length();
         for(int i=0;i<obj.length()/2;i++){
            if(obj.charAt(i)!=obj.charAt(n-i-1)){
                return false;
            }
         }
         return true;
    }
    public static float getshorestpath(String obj){
        int x=0;int y=0;
        for(int i=0;i<obj.length();i++){
            char dir=obj.charAt(i);
            if(dir=='S'){
              y--;
            }else if(dir=='N'){
                y++;
            }else if (dir=='E'){
                x++;
            }else{
                x--;
            }
        }
       int   X2=x*x,Y2=y*y;
       return (float)Math.sqrt(X2+Y2);
    }
   public static String subString(String obj,int si,int ei){
          String shortString= "" ;
          for(int i=si;i<=ei;i++){
            shortString+=obj.charAt(i);
          }
          return shortString;
   }
   public static void PN(int n){
    if(n==1){
        System.out.println(n);
        return;
    }
    System.out.println(n);
    PN(n-1); 
    
   }
    public static void main(String arg[]){
        PN(5);
}
}