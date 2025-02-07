//In this challenge, you must read 
//integers from stdin and then print them to stdout. 

package stdinstdout;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		   Scanner scan = new Scanner(System.in);     
	        
	        while(scan.hasNextInt()) {
	        	int a = scan.nextInt();
	        	System.out.println(a);
	        }
	        
	        //scan.forEachRemaining(System.out::println);
	        

	}

}
