class Animal{
void eat(){
System.out.println("Dog eats");
}
}
class Dog extends Animal{
void bark()
{
System.out.println("Dog barks");
}
}
public class single{
public static void main(String [] args){
Dog d = new Dog();
d.eat();
d.bark();
}
}





























