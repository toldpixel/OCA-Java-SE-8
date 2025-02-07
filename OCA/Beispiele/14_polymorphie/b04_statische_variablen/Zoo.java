// Z:\JAV1\examples\14_polymorphie\b04_statische_variablen

public class Zoo
{
  public static void main(String[] args)
  {
    // Zugriff über die Klasse
    System.out.println(Animal.text);
    System.out.println(Cat.text);
    
    // Zugriff über Objekte
    Cat fritz = new Cat();
    System.out.println(fritz.text);
    
    // Bei statische Variablen gibt es KEINE Polymorphie
    Animal grobi = new Cat();
    System.out.println(grobi.text);
    
    // Auch statische Attribute werden vererbt
    System.out.println(Animal.legs);
    System.out.println(Cat.legs);
    System.out.println(fritz.legs);
  }
}