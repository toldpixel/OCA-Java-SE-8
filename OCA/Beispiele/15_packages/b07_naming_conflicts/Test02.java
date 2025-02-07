// Z:\JAV1\examples\15_packages\b07_naming_conflicts

import packageA.Klasse;
import packageB.*;

public class Test02
{
  public static void main(String[] args)
  {
    Klasse kA = new Klasse();
    Klasse kB = new Klasse();
    
    kA.saySomething();
    kB.saySomething();
  }
}
