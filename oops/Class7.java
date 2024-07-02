	package oops;
import java.util.Scanner;
class student{
private String name;
private int Age;
private int standard;
void show() {
	System.out.println(name+" "+ Age+" "+standard);
   
    }
void input() {
	System.out.println("Enter the name");
	 Scanner sc=new Scanner(System.in);
	   name= sc.next();
	    System.out.println("Enter the age");
	    Age=sc.nextInt();
	    System.out.println("Enter the standard");
	    standard=sc.nextInt();
	    sc.close();

}
}
public class Class7 {

	public static void main(String[] args) {
		
  student a=new student();
  student b=new student();
  student c=new student();
  student d=new student();
  student e=new student();
  
  
 a.input();
 b.input();
 c.input();
 d.input();
 e.input();
 a.show();
 b.show();
 c.show();
 d.show();
 e.show();
}
}
