public class Stringpool {
    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();
        Object o3 = o1;

        System.out.println(o1 == o2);
        System.out.println(o1 == o3);

        String s1 = "Hallo";
        String s2 = "Hallo";
        String s3 = s1;

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);

        String s4 = new String("Hallo");
        String s5 = new String("Hallo");
        System.out.println(s4 == s5);

        // String-Literale werden im Stringpool gespeichert.
        // Wenn ein String-Literal verwendet wird, wird zuerst nach 
        // einem identischen Objekt im Stringpool gesucht. Falls eines gefunden wird, wird die Referenz zu diesem Objekt verwendet.

        
    }
}
