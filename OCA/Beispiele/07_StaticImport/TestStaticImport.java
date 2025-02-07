// Z:\JAV1\examples\07_StaticImport

import static java.lang.System.out;
import static java.lang.Integer.*;
import static java.lang.Long.*;
// import static TestStatic.*;
// cannot find symbol
// import static NUR aus "echten" packages

import static pack.TestStatic.*;

public class TestStaticImport
{
  static long x = 42;
  
  public static void main(String[] args)
  {
    out.println(Integer.MAX_VALUE);
    out.println(toHexString(x));
    pack.TestStatic.main(new String[0]);
    // main() aus pack.TestStatic wird von der eigenen main()
    // überschattet, ist also nur mit vollständige Adressierung
    // erreichbar.
  }
}