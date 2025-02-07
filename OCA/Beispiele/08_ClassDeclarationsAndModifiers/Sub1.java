// Z:\JAV1\examples\08_ClassDeclarationsAndModifiers

import pack1.*;

public class Sub1
{
  public static void main(String[] args)
  {
 // Default clDef = new Default();
 /*
    error: Default is not public in pack1; cannot be accessed from outside package
 */
 
    Public clPub = new Public();
    
    System.out.println(clPub.xPub);
    
 // System.out.println(clPub.xPro);
 // error: xPro has protected access in Public
 
 // System.out.println(clPub.xDef);
 // xDef is not public in Public; 
 // cannot be accessed from outside package
 
 // System.out.println(clPub.xPri);
 // error: xPri has private access in Public
  }
}