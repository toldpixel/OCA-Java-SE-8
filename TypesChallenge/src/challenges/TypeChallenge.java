package challenges;

public class TypeChallenge {

	public static void main(String[] args) {
		byte var1 = 10;
		short var2 = 20;
		int var3 = 50;
		long var4 = 50000L;
		long totalVar = var4 + 10L * (var1 + var2 + var3);
		System.out.println(totalVar);

	}

}
