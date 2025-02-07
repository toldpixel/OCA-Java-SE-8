import java.util.Scanner;

class Hashfunction {
	String str = new String("");
	int len;
	
	
	public Hashfunction(String input) {
		this.str = input;
		this.len = input.length();
		char[] charArray = new char[len];
		int[] hashValue = new int[len];
		String hash = new String();
		
		
		for(int i = 0; i < len; i++) {
			charArray[i] = str.charAt(i);
		}
		
		for(int i = 0; i < len; i++) {
			hashValue[i] = (int)charArray[i];
			System.out.print(hashValue[i]);
		}
		
		
	}
	
}


public class Hashfuction {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String value = sc.nextLine();
		Hashfunction hs = new Hashfunction(value);
		//hs.outputHash();
	}
}
