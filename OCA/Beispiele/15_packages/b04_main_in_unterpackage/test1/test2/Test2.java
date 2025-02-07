// Z:\JAV1\examples\15_packages\b04_main_in_unterpackage

package test1.test2;

import test3.*;

public class Test2
{
  public static void main(String[] args)
  {
    new test1.Test1();
    new       Test3();
    
    test1.Test1.main(new String[10]);
  }
  
  static
  {
    System.out.println("test1.test2.Test2");
  }
}