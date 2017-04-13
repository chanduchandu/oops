class Person{
String name;
Person(String na){
	name=na;	
}
}
class Teacher extends Person{
int salary;
String sub;
Teacher(String na,int sal,String su){
	super(na);
	salary=sal;
	sub=su;
}
void first(){
System.out.println(name+","+salary+","+sub);}

}
class Student{
String stName;
int rollno;
Student(String stN,int roll){
	stName=stN;
	rollno=roll;
}
}
class ClgStudent extends Student{
int year;
String major;
ClgStudent(String stN,int roll,int ye,String maj){
	super(stN,roll);
	year=ye;
	major=maj;
}
void second(){
System.out.println(stName+","+rollno+","+year+","+major);

}
public static void main(String[]args){
Teacher t=new Teacher("hansi",25000,"maths");
ClgStudent s=new ClgStudent("narniya",34,3,"ece");
t.first();
s.second();
}
}