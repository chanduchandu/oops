class Constructor{
static int age;
public static int hello(int ag){
	return ag;
}
public static int hel(int ag){
	return ag;
}
public static void main(String[]args){

Constructor cA=new Constructor();
Constructor co=new Constructor();
cA.age=20;
co.age=87;
System.out.println(cA.hello(120));
System.out.println(cA.hel(12));

}
}