package oops;

class studentt{
	String Name;
	String FathersName;
	String MothersName;
	int RollNo;
	int Age;
	static int  SchoolFee;
	static String SchoolName;
	static int Standard;
	static int count=0;
	{
		count++;
		System.out.println("Number of objects"+count);
	}
	
}
public class ClassEx1 {

	public static void main(String[] args) {
    System.out.println("Program to create and understand classes;");
    studentt S1=new studentt();
    studentt S2=new studentt();
    studentt S3=new studentt();
    studentt S4=new studentt();
    studentt S5=new studentt(); 
    System.out.println(S1.Name+" "+S1.FathersName+" "+ S1.MothersName+" "+S1.RollNo+" "+S1.Age+" "+studentt.Standard+" "+studentt.SchoolFee+" "+studentt.SchoolName);
    System.out.println(S2.Name+" "+S2.FathersName+" "+ S2.MothersName+" "+S2.RollNo+" "+S2.Age+" "+studentt.Standard+" "+studentt.SchoolFee+" "+studentt.SchoolName);
    System.out.println(S3.Name+" "+S3.FathersName+" "+ S3.MothersName+" "+S3.RollNo+" "+S3.Age+" "+studentt.Standard+" "+studentt.SchoolFee+" "+studentt.SchoolName);
    System.out.println(S4.Name+" "+S4.FathersName+" "+ S4.MothersName+" "+S4.RollNo+" "+S4.Age+" "+studentt.Standard+" "+studentt.SchoolFee+" "+studentt.SchoolName);
    System.out.println(S5.Name+" "+S5.FathersName+" "+ S5.MothersName+" "+S5.RollNo+" "+S5.Age+" "+studentt.Standard+" "+studentt.SchoolFee+" "+studentt.SchoolName);
    S1.Name="Gauri";
    S1.FathersName="Rajesh Kumar Sharma";
    S1.MothersName="Anjani Sharma";
    S1.RollNo=50;
    S1.Age=19;
    studentt.SchoolName="DDDDD";
    studentt.Standard=10;
    studentt.SchoolFee=4000;
    S1.Name="Gauri";
    S1.FathersName="Rajesh Kumar Sharma";
    S1.MothersName="Anjani Sharma";
    S1.RollNo=50;
    S1.Age=19;
    S2.Name="Gauri";
    S2.FathersName="Rajesh Kumar Sharma";
    S2.MothersName="Anjani Sharma";
    S2.RollNo=50;
    S2.Age=19;
    S3.Name="Gauri";
    S3.FathersName="Rajesh Kumar Sharma";
    S3.MothersName="Anjani Sharma";
    S3.RollNo=50;
    S3.Age=19;
    S4.Name="Gauri";
    S4.FathersName="Rajesh Kumar Sharma";
    S4.MothersName="Anjani Sharma";
    S4.RollNo=50;
    S4.Age=19;
    S5.Name="Gauri";
    S5.FathersName="Rajesh Kumar Sharma";
    S5.MothersName="Anjani Sharma";
    S5.RollNo=50;
    S5.Age=19;
    System.out.println(S1.Name+" "+S1.FathersName+" "+ S1.MothersName+" "+S1.RollNo+" "+S1.Age+" "+studentt.Standard+" "+studentt.SchoolFee+" "+studentt.SchoolName);
    System.out.println(S2.Name+" "+S2.FathersName+" "+ S2.MothersName+" "+S2.RollNo+" "+S2.Age+" "+studentt.Standard+" "+studentt.SchoolFee+" "+studentt.SchoolName);
    System.out.println(S3.Name+" "+S3.FathersName+" "+ S3.MothersName+" "+S3.RollNo+" "+S3.Age+" "+studentt.Standard+" "+studentt.SchoolFee+" "+studentt.SchoolName);
    System.out.println(S4.Name+" "+S4.FathersName+" "+ S4.MothersName+" "+S4.RollNo+" "+S4.Age+" "+studentt.Standard+" "+studentt.SchoolFee+" "+studentt.SchoolName);
    System.out.println(S5.Name+" "+S5.FathersName+" "+ S5.MothersName+" "+S5.RollNo+" "+S5.Age+" "+studentt.Standard+" "+studentt.SchoolFee+" "+studentt.SchoolName);

	}

}
