package oops;


public class Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Classs a= new Classs();
    Classs b= new Classs();
     Classs c=new Classs();
//     System.out.println(a.NumberOfStudents+a.Section+a.Standard);
//     System.out.println(b.NumberOfStudents+b.Section+b.Standard);
//     System.out.println(c.NumberOfStudents+c.Section+c.Standard);
     a.NumberOfStudents=34;
     a.Section='A';
     a.Standard=8;
     b.NumberOfStudents=35;
     b.Section='B';
     b.Standard=8;
     c.NumberOfStudents=38;
     c.Section='C';
     c.Standard=8;
//     System.out.println(a.NumberOfStudents+a.Section+a.Standard);     (This will add all the Values)
//     System.out.println(b.NumberOfStudents+b.Section+b.Standard);
//     System.out.println(c.NumberOfStudents+c.Section+c.Standard);
     System.out.println(a.NumberOfStudents+" "+a.Section+" "+a.Standard);
     System.out.println(b.NumberOfStudents+" "+b.Section+" "+b.Standard);
     System.out.println(c.NumberOfStudents+" "+c.Section+" "+c.Standard);
	}

}
class Classs{
	int NumberOfStudents;
	int Standard;
	char Section;
}
