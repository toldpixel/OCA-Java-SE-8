// Z:\JAV1\examples\15_packages\b07_naming_conflicts

import packageA.*;      // Alle Klassen in packageA
import packageA.Klasse; // Default bei Konflikte
import packageB.*;      // Alle Klassen in packageB

/*
    Bei Konflikte hat der Default präferenz.
    Gleichnamige Klallen aus anderen Paketen
    werden über die vollqualifizierte Adressierung
    erreicht.
*/

public class Test06
{
  public static void main(String[] args)
  {
    Klasse          kA = new Klasse();
    packageB.Klasse kB = new packageB.Klasse();
    ClassA          cA = new ClassA();
    
    kA.saySomething();
    kB.saySomething();
    cA.saySomething();
  }
}
