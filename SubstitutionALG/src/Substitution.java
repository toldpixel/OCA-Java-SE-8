import java.util.Random;
import java.util.Scanner;

class Crypter {
	private Random rand = new Random();
	String key = new String();
	private String buchstaben = "abcdefghijklmnopqrstuvwxyz";
	private int n = buchstaben.length();
	private String msg = new String();
	
	public Crypter(String msg) {
		char[] chArr = new char[26];
		System.out.print("Generiere Schlüssel: ");
		for (int i = 0; i < 26; i++) {
			chArr[i] = buchstaben.charAt(rand.nextInt(n));
	    }
		this.key = String.valueOf(chArr);
		System.out.println(key);
		
		this.msg = msg;
	}
	
	public void doEncryption() {			//Angabe Rotation
		char[] encryptedStr = new char[msg.length()];
		int nbr = 0;
		for(int i = 0; i < msg.length();i++) {
			//System.out.println("msg char: "+msg.charAt(i));
			int temp = (int) msg.charAt(i);
			if(temp <= 122 && temp >= 97) {
				nbr = temp-96;
			//System.out.println("alphabetic position: "+nbr);
			}
			
			encryptedStr[i] = key.charAt(nbr-1);
			
		}
		
		System.out.println("Substitution: "+String.valueOf(encryptedStr));
	}
	
	public String doDecryption() {		
		return "";
	}
}


public class Substitution {
	
	
	public static void main(String[] args) {
		Crypter cr1;
		String msg = new String();
		Scanner sc = new Scanner(System.in);
		System.out.println("Geben Sie den Klartext ein:");
		msg = sc.next();
		cr1 = new Crypter(msg);
		cr1.doEncryption();
	}

}
