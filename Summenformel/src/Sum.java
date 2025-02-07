import java.util.Scanner;

public class Sum {
	private int ergebnis = 0;
	
	public int getErgebnis() {
		return ergebnis;
	}

	public int addSum(int n,int sum) {
		sum += n;
		System.out.println(""+n+"+");
		n--;
		
		if(n >= 1)
			addSum(n,sum);
		else
			this.ergebnis = sum; 
		
		return 0;	
	}
	
	public static void main(String[] args) {
		System.out.print("Eingabe: ");
		 Scanner sc = new Scanner(System.in);
		 
		 int n = sc.nextInt();
		 int sum = 0; 
		 Sum su = new Sum();
		 su.addSum(n,sum);
		 System.out.println("Ergebnis: "+su.getErgebnis());
		 
		/* while(n >= 1) {
			 sum += n;
			 System.out.println(""+n+"+");
			 n--;
				 
		 }*/
	}

}
