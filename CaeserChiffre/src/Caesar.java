import java.util.Scanner;

class Crypter {
	private String cipherText = new String();
	char[] buchstaben = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 
            'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 
            'w', 'x', 'y', 'z'};
	
	public Crypter(String msg) {
		this.cipherText = msg;
	}

	public String getMsg() {
		return "";
	}

	public void setMsg(String msg) {
		this.cipherText = msg;
	}
	
	public void doEncryption(int rot) {			//Angabe Rotation
		char[] buffer = this.cipherText.toCharArray();
		//char[] encryptedText = new char[cipherText.length()];
		String str1 = new String();
		System.out.println("Chiffre-Text: ");
		for(int i = 0; i < buffer.length; i++) {
			System.out.print((char)(buffer[i]+rot % buchstaben.length));
			//encryptedText[i] = (char)(buffer[i]+rot % buchstaben.length);
		}
		
		//str1 = encryptedText.toString();
		//return str1;
	}
	
	public String doDecryption() {
		
		return "";
	}
}

public class Caesar {

	public static void main(String[] args) {
		Crypter cr1;
		String msg = new String();
		Scanner sc = new Scanner(System.in);
		System.out.println("Geben Sie den Klartext ein:");
		msg = sc.next();
		cr1 = new Crypter(msg);
		cr1.doEncryption(3);
	}

}
