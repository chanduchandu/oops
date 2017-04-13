class firstBox{
public double rec(double width,double height,double depth){
double result=width*height*depth;
return result;
}
public static void main(String[]args){
firstBox fb=new firstBox();
System.out.println(fb.rec(12.0,11.0,10.0));
}
}