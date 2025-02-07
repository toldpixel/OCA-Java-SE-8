package binarySearch;

import java.util.Arrays;

class BinarySearch {

	int suche(int array[], int links,int rechts, int X) {

		if(rechts >= links) {
			int mitte = (rechts - links)/2;


			if(array[mitte] == X) {
				return mitte+1;
			}

			if(array[mitte] > X) {
				return suche(array,links,mitte-1,X);
			}

			return suche(array,mitte+1,rechts,X);	
		}

		return -1;
	}

	public static void main(String[] args) {

		BinarySearch test = new BinarySearch();
		int array[] = {1,12,3,7,4,5,6,19};
		Arrays.sort(array);

		for(int i = 0; i<array.length;i++)
			System.out.print(" "+array[i]);

		System.out.println();
		int n = array.length;

		int wert = 5;
		int ergebnis = test.suche(array,0,n-1,wert);

		if (ergebnis == -1)
			System.out.println("kein wert vorhanden");
		else
			System.out.println("Wert "+wert+" gefunden an Stelle " + ergebnis);
	}
}
