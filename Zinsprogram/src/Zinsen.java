import java.util.Scanner;

public class Zinsen {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double zinssatz = 3.45;
		int jahre = 1;
		System.out.println("Geben Sie Ihr verfuegbares Kapital ein:");
		double kapital = sc.nextDouble();
		
		while(jahre++ <= 50 ) {
			  kapital = (kapital * zinssatz) / 100;
			 System.out.println(""+jahre+". Jahr"+" "+kapital+"Euro");
		}
		
	}
}
