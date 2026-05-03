class Circle {
    double radius;

      double PI ;
    
    Circle(){
        
       PI=3.142;
    }
    Circle(double r) {
        radius = r;
       
    }


    void area() {
        double result = PI * radius * radius;
        System.out.println("Area of Circle = " + result);
    }

    public static void main(String[] args) {
        Circle obj = new Circle(7);
        obj.area();
    }
}