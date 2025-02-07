// Z:\JAV1\examples\16_overriding_overloading

public class Stringpool
{
  public static void main(String[] args)
  {
    Object o1 = new Object();
    Object o2 = new Object();
    Object o3 = o1;
    
    System.out.println(o1 == o2); // false
    System.out.println(o1 == o3); // true
    
    String s1 = "Hallo";  // String-Literal -> Stringpool
    String s2 = "Hallo";
    String s3 = s1;

    System.out.println(s1 == s2); // true
    System.out.println(s1 == s3); // true
    
    String s4 = new String("Hallo");
    String s5 = new String("Hallo");
    System.out.println(s4 == s5);
    
    // String-Literale werden im Stringpool gespeichert.
    // Wenn ein String-Literal verwendet wird, wird zuerst nach
    // ein identisches Objekt im Stringpool gesucht. Falls eins 
    // gefunden wird, wird der Referenz zu diesem Objekt
    // verwendet.
    
    // Um die Inhalte von Objekten zu vergleichen, muss die
    // Operation equals() benutzt werden.
    System.out.println(s4.equals(s5));
    
    // Das setzt vosaus, dass equals() überschrieben wurde.
    // Das ist NICHT bei allen Basisklassen der Fall!
    System.out.println(o1.equals(o2));
  }
}