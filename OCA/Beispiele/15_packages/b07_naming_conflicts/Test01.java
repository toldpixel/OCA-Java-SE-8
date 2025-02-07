// Z:\JAV1\examples\15_packages\b07_naming_conflicts

import packageA.*;
import packageB.*;

public class Test01
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
    error: reference to Klasse is ambiguous
    Klasse kA = new Klasse();
    ^
  both class packageB.Klasse in packageB and class packageA.Klasse in packageA match
*/