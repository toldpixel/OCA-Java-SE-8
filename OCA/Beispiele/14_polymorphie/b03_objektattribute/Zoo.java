// Z:\JAV1\examples\14_polymorphie\b03_objektattribute

public class Zoo
{
  public static void main(String[] args)
  {
    Cat fritz = new Cat();
    
    System.out.println(fritz.text);
    System.out.println(fritz.legs);
    // Objektattribute werden vererbt
    
    Animal grobi = new Cat();
    
    System.out.println(grobi.text);
    System.out.println(grobi.legs);
    
    // Bei Objektattribute gibt es KEINE Polymorphie
    
    grobi = null;
 // System.out.println(grobi.text);
 /*
    Compiliert, zur Laufzeit java.lang.NullPointerException
 */
 
    Cat cat;
 // System.out.println(cat.text);
 /*
    error: variable cat might not have been initialized
 */
  }
}