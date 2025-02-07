// Z:\JAV2\examples\01_constructor\02_constructor_private

import pack.*;

public class Sub // extends Super
                 // error: Super() has private access in Super
{
  public static void main(String[] args)
  {
    Super sup1 = Super.factory();
 // sup1.saySomething();
 // error: saySomething() has protected access in Super
    Super.SuperSub supsub = new Super.SuperSub();
 // supsub.saySomething();
 // error: saySomething() has protected access in Super
 
 // Die Operation in SuperSub überschrieben
    supsub.saySomething();
  }     
}