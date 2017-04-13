class Employee{
int empid;
String name;
int salary;
/*void getsalary(int sal){
	salary=sal;
}
void getempid(int id){
	empid=id;
}
void getname(String na){
	name=na;
}*/
public int getsum(int a,int b)
{
int c=a+b;
return c;
}
public void getname(){
System.out.println(empid+" "+name+" "+salary);
}
public static void main(String[]args){
Employee emp1=new Employee();
emp1.salary=25000;
emp1.name="chandu";
emp1.empid=8998;
emp1.getname();
System.out.println(emp1.getsum(10,20));
}
}