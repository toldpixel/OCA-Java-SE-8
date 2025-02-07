// Z:\JAV1\examples\15_packages\b03_package_im_package

package test2;

import test2.test3.*;

public class Test2
{
  public static void main(String[] args)
  {
    new test2.test1.Test1();
    new             Test3();
  }
  
  static
  {
    System.out.println("test2.Test2");
  }
}