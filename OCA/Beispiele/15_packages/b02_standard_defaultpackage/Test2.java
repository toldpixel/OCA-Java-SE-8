// Z:\JAV1\examples\15_packages\b02_standard_defaultpackage

import test3.*;

public class Test2
{
  public static void main(String[] args)
  {
    new test1.Test1();
    new       Test3();
  }
  
  static
  {
    System.out.println("Test2");
  }
}