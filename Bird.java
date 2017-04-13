class Animal{
void eat(){
System.out.println("animal eating");
}
void sleep(){
System.out.println("animal sleeping");
}
}
class Bird extends Animal{
void eat(){
System.out.println("bird eating");
}
void sleep(){
System.out.println("bird sleeping");
}
void fly(){
System.out.println("bird flying");
}
public static void main(String []args){
Animal a=new Animal();
a.eat();
a.sleep();
Bird b=new Bird();
b.eat();
b.sleep();
b.fly();

}
}