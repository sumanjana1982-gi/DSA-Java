class Car{
    String colour;
    void drive(){
        System.out.print("Can Drive.");
    }
}
public class opps{
    public static void main(String arg[]){
        Car c1=new Car();
        c1.colour="red";
        System.out.println(c1.colour);
        c1.drive();
    }
}