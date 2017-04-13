class employee extends person {
int year;
int salary;
String insurance;
//employee(int year,int salary,String insurance){
	employee(String name,int year,int salary,String insurance){
	super(name);
this.year=year;
this.salary=salary;
this.insurance=insurance;
}
void hello(){
System.out.println(name+" "+year+" "+salary+" "+insurance);
}

}