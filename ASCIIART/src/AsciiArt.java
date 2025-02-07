import java.util.Scanner;

public class AsciiArt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		int result = 0;
		int ctr = 0;
		
		while(number > 5) {
			number -= 5;
			ctr++;
		}
		System.out.println(result);
	}

}
