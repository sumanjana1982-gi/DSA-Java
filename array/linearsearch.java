 public class linearsearch{
    public static int LS(int a[],int key){
        for(int i=0;i<a.length;i++){
            if(a[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String arg[]){
      int x[]={1,3,5,6,7,8,9,210,36,89};
      int k=4;
      int result=linearsearch.LS(x,k);
      if(result==-1){
        System.out.print(k+"not found");
      }else{
        System.out.print(k+"founded at"+result);
      }
    }
 }