public class Obj{
    public static int getithBit(int n,int i){
        int Bitmask=1<<i;
        if((n&Bitmask)==0){
           return 0;

        }else{
            return 1;
        }
    }
    public static int setIthbit(int n,int i){
        int Bitmask=1<<i;
        int result=n|Bitmask;
        return result;
    }
    public static int clearIthbit(int n,int i){
        int bitmask=~(1<<i);
        return n&bitmask;
    }
    public static int Updateithbit(int n,int i,int bit){
        if(bit==0){
        return clearIthbit(n, i);
        }else {
          return   setIthbit( n, i);
        }
          
    }
      public static int clearRange(int n,int i,int j){
        int a=(~0)<<(j+1);
        int b=(1<<i)-1;
        int bitmas=a|b;
        return n&bitmas;
      }
      public static boolean powerOrnot(int n){
        return (n&(n-1))==0;
      }
    public static void main(String arg[]){
     //System.out.println(Updateithbit(5,2,0));//clear ans=1
    // System.out.print(Updateithbit(5,1,1));//set ans=7
    //System.out.print(clearRange( 10, 2, 5));
    System.out.print(powerOrnot( 7));
    }
}