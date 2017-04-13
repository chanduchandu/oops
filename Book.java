class Author{
String name;
String email;
char gender;
Author(String na,String em,char ge){
name=na;
email=em;
gender=ge;
}
}
class Book{
String name;
int qnt;
double price;
Author author;
Book(String na,int q,double pr,Author a){
name=na;
qnt=q;
price=pr;
author =a;
}
void getAuthor(){
System.out.println(author.name+" "+author.email+" "+author.gender);
}
void getPrice(){
System.out.println(price);
}
void getQtyInStock(){
System.out.println(qnt);
}
void getName(){
System.out.println(name);
}
public static void main(String [] args){
Author ar=new Author("john","john@",'m');
Book b0=new Book("java",7,45.5,ar);
Book b1=new Book("php",9,37.6,ar);
b0.getName();
b0.getPrice();
b0.getQtyInStock();
b0.getAuthor();

b1.getName();
b1.getPrice();
b1.getQtyInStock();
b1.getAuthor();
}
}