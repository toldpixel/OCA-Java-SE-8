// Z:\JAV1\examples\15_packages\b05_import_static

import static java.lang.Math.*;
import static java.lang.System.*;
import static test1.Test1.*;
// import static Test3.*;

// import *;

public class Test2
{
  public static void main(String[] args)
  {
    out.println(sqrt(25));
    out.println(PI);
    
    halloTest1();
    
    /*
        'import static' funktioniert nur bei Klassen, die
        sich in einem 'echten' package befinden - NICHT
        für Klassen im default-package.
    */
    
    Test3.halloTest3();
  }
}