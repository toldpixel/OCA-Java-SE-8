public class DecBin {
	
	public void binaer(int a) {
		int b = a;
		while(true) {
			int test = a & b;		
			if(test > 0)
				System.out.print("1");
			else
				System.out.print("0");				
			a >>= 1;
			
			if(a == 0)
				break;
		}
		System.out.println(" DEC:"+b+"");
	}
	public static void main(String[] args) {
		DecBin neu = new DecBin(); 
		neu.binaer(10);		
	}
}
