
public class Abstractclass {
    public static void main(String args[]){
       Mustang m= new Mustang();
       // inheritance in heirachy of constructor call Animal -> Horse -> Mustang
       m.eat();
       m.walk();
    }
}
abstract class Animal{
    Animal(){
        System.out.println("Animal constructor was called !!");
    }
    void eat(){
        System.out.println("animal eats !!");
    }
    abstract void walk();
}
class Horse extends Animal{
    Horse(){
        System.out.println("Horse constructor was called !!");
    }
    void walk(){
        System.out.println("horse walks on 4 legs");
    }
}
class Mustang extends Horse{
    Mustang(){
        System.out.println("Maustang constructor was called");
    }
}