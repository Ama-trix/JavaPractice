package Function;

public class SIwithargumentsandreturn {
	static float SimpleInterest(float p, float r, float t) {
		return (p*r*t)/100;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      java.util.Scanner sc= new java.util.Scanner(System.in);
      System.out.println("Program to find the SIMPLE INTEREST WITH ARGUMENTS AND RETURN");
      System.out.println("Enter the Principle, Rate and Time");
      float p=sc.nextFloat();
      float r=sc.nextFloat();
      float t=sc.nextFloat();
      System.out.println("The Simple Interest is "+SimpleInterest(p,r,t));
      sc.close();
	}

}
