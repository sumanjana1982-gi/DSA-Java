import java.util.*;
class suman{
    int a,b,c,p;
    void getdata(){
     Scanner obj=new Scanner(System.in);
     
        System.out.println("Enter length :");
        a=obj.nextInt();
       System.out.println("Enter breadth:");
       b=obj.nextInt();
     
    }
    void calculatearea(){
        c=a*b;
    }
    void calculateperimeter(){
        p=2*(a+b);
    }

    void output(){
        System.out.println("area is "+c);
         System.out.println("perimeter is "+p);
    }
}
class nit{
    public static void main(String[] args) {
       suman obj1=new suman();
       obj1.getdata();
       obj1.calculatearea();
       obj1.calculateperimeter();
       obj1.output();
    }
}