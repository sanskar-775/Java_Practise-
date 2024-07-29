public class Inheritance {
    public static void main (String args[]){
        Dogs shiro =new Dogs();
        shiro.legs=4;
        System.out.println(shiro.legs);
        shiro.eat();
    }
}
class Animal{//BASE CLASS
    int color;
    void eat(){
        System.out.println("Eats !!");
    }
    void breathe(){
        System.out.println("breathes !!");
    }
}
class Mammals extends Animal{
    int legs;
    void walk(){
        System.out.println("walks !!");
    }
}
class Dogs extends Mammals{
    String breed;
}
 class Fish extends Animal{//DERIVED CLASS
     int fins;
     void swim(){
        System.out.println("Swims !!");
    }
}
class Birds extends Animal{
    int Wings;
    void fly(){
        System.out.println("Fly !!");
    }
}
