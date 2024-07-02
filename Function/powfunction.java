package Function;

public class powfunction {
public static void main(String args[]) {
//	double a=2;
//	double b=63;
//	double p=Math.pow(a, b);
//	System.out.println(p);
	int b=2,a=30;
	int p=1;
	int i=1;
	while(i<=a) {
		p*=b;
		i++;
	}
	System.out.println(p);
	
}
}
