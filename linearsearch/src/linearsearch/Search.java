package linearsearch;

import java.util.Random;
import java.util.Arrays;

class SearchObj{
	private int X;
	private int N;
	int[] array;
	Random rand;
	
	public SearchObj(int X,int N) {
		this.X = X;
		this.N = N;
	}

	public void generateArray() {
		array = new int[this.N];
		rand = new Random();
		int n = 0,i;
		for(i = 0; i < N;i++) {
			array[i] = rand.nextInt(2000) + 1;
		}
		Arrays.sort(array);
		i = 0;
		while(i < array.length-1) {
			if(array[i] == array[i+1]) {
				array[i] = 0;
			}
		 i++;
		}
	}
	
	
	public void outputArray() {
		for(int i = 0; i < N;i++) {
			System.out.print(" "+array[i]);
		}
	}
	
	public boolean searchArray(int searchKey) {
		for(int i = 0; i < array.length;i++) {
			if(array[i] == searchKey) {
				System.out.println("Der gesuchte Wert "+searchKey+" befindet sich an"+i+" stelle");
				return true;
			}
		}
		return false;
	}
	
	public int getX() {
		return X;
	}

	public void setX(int x) {
		X = x;
	}

	public int getN() {
		return N;
	}

	public void setN(int n) {
		N = n;
	}
	

}


public class Search {

	public static void main(String[] args) {
		SearchObj linearsearch = new SearchObj(10,200);
		linearsearch.generateArray();
		linearsearch.outputArray();

	}

}
