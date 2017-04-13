class Calculator
{
public static double powerInt(int num1,int num2){
	double a=(double)num1;
	double b=(double)num2;
double result=Math.pow(a,b);
return result;
}
public static double powerDouble(double num1,int num2){
double c=(double)num2;
double result=Math.pow(num1,c);
return result;
}}
class cal{
public static void main(String[]args){
System.out.println(Calculator.powerInt(2,3));
System.out.println(Calculator.powerDouble(2.0,3));
}
}
