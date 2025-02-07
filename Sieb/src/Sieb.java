import java.util.Scanner;

public class Sieb {
	private int[] arr;
	private int sizeofsieve;
	private int zahl;

	public Sieb(int zahl) {
		this.sizeofsieve = zahl;
		this.zahl = zahl;
	}
	public void berechneSieb() {
		//System.out.println("zahlen werden befüllt bis sqrt("+this.sizeofsieve+")");
		arr = new int[this.sizeofsieve];

		for(int k = 0; k < this.sizeofsieve; k++) {
			arr[k] = k+1;							//Start bei 1 und nicht 0
		}
	}

	public void ausgabeSieb() {
		for(int i = 0; i < this.arr.length;i++) {
			System.out.printf("%2d ",this.arr[i]);		//Formatierer
			if((i+1)%5 == 0) {							//Zeilenumbruch nach 5 Zahlen
				System.out.println();
			}
		}
	}

	public void ausgabePrim() {
		System.out.println("Primzahlen:");
		for(int i = 0; i < this.arr.length;i++) {
			if(arr[i] != 0){	
				System.out.printf("%d ",this.arr[i]);	//Formatierer
				if(i%4 == 0)
					System.out.println();
			}
		}
	}

	public void primTest() {
		arr[0] = 0;									// 1 ist in keinem Fall eine Primzahl, deshalb ist das 1. Element 0

		int multiplesof = (int) Math.sqrt(this.zahl); 	//Die Vielfache welche geprüft werden. Von 2 - Zahl
		for(int i = 2; i <= multiplesof;i++) {
			for(int j = i; j < arr.length ; j++) {
				if(arr[j] % i == 0) {
					arr[j] = 0;
				}
			}
		}
	}

	public static void main(String[] args) {
		Sieb sb;
		Scanner sc = new Scanner(System.in);
		System.out.println("Geben Sie eine Zahl ein:");
		int zahl;
		while((zahl = sc.nextInt()) < 2) {
			System.out.println("Zahl zu klein");
		}
		sb = new Sieb(zahl);
		sb.berechneSieb();
		sb.ausgabeSieb();
		sb.primTest();
		sb.ausgabePrim();	
	}
}