// Z:\JAV1\examples\15_packages\b07_naming_conflicts

import packageA.Klasse;
import packageB.Klasse;

public class Test04
{
  public static void main(String[] args)
  {
    Klasse kA = new Klasse();
    Klasse kB = new Klasse();
    
    kA.saySomething();
    kB.saySomething();
  }
}

/*
    error: a type with the same simple name is already defined by the single-type-import of Klasse
    import packageB.Klasse;
    ^
    1 error
*/
