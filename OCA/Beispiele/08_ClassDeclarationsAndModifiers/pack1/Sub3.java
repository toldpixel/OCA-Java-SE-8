// Z:\JAV1\examples\08_ClassDeclarationsAndModifiers

package pack1;

public class Sub3
{
  public static void main(String[] args)
  {
    System.out.println(new Public().xPub);
    System.out.println(new Public().xPro);
    System.out.println(new Public().xDef);
 // System.out.println(new Public().xPri);
 // error: xPri has private access in Public

    System.out.println(new Default().xPub);
    System.out.println(new Default().xPro);
    System.out.println(new Default().xDef);
  }
}