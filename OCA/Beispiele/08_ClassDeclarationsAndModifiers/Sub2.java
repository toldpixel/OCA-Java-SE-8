// Z:\JAV1\examples\08_ClassDeclarationsAndModifiers

import pack1.*;

public class Sub2 extends Public
{
  public static void main(String[] args)
  {
    Sub2 sub2 = new Sub2();
    
    System.out.println(sub2.xPub);
    sub2.getXpub();

    System.out.println(sub2.xPro);
    sub2.getXpro();

 // System.out.println(sub2.xDef);
 // error: xDef is not public in Public; 
 // cannot be accessed from outside package
 
 // System.out.println(sub2.xPri);
 // error: xPri has private access in Public
  }
  
  void getXpub()
  {
    System.out.println(super.xPub);
  }

  void getXpro()
  {
    System.out.println(super.xPro);
  }
}