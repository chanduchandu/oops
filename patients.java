class patient{
String name;
double height;
double weight;
patient(String name,double height,double weight){
this.name=name;
this.height=height;
this.weight=weight;
}
public double BMI(){
double b=(weight/(height*height))*(double)703;
return b;
}
}
class patients{
public static void main(String[]args){
patient pa=new patient("sanjana",5.7,57.5);
System.out.println(pa.BMI());
}

}