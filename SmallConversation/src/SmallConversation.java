
public class SmallConversation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Moin! Wie heiﬂt denn du ?.");
		String name = new java.util.Scanner(System.in).nextLine();
		System.out.printf("Hallo %s. Wie alt bist du?%n",name);
		int age = new java.util.Scanner(System.in).nextInt();
		System.out.printf("Aha, %s Jahre, das ist ja die H‰lfte von %s%n", age, age * 2);
		System.out.println( "Sag mal, was ist deine Lieblingsflieﬂkommazahl?" );
		double value = new java.util.Scanner( System.in ).nextDouble();
		System.out.printf( "%s? Aha, meine ist %s.%n",
		value, Math.random() * 100000 );
		
	}

}
