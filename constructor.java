class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Bark");
    }
}
public class constructor{
public static void main(String arg[]){
 Dog d=new Dog();
 d.sound();
}}