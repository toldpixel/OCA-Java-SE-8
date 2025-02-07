// Z:\JAV1\examples\10_DeclareClassMembers\e_AbstractClasses

public class Concrete extends Abstract
{
  /*
  Das Programm kann mit 'java Concrete' oder mit 'java Abstract'
  gestartet werden, auch wenn die Klasse Concrete keine eigene
  'main'-Methode hat.
  */
  /*
  public static void main(String[] args)
  {
    Abstract concrete = new Concrete();
    concrete.doIt();
  }
  */

  public static void main(String[] args)
  {
    Abstract concrete = new Concrete();
    concrete.doIt();
    concrete.doMore();
  }
  
  // void doIt()
  // attempting to assign weaker access privileges; was public
  
  public void doIt()
  {
    System.out.println("Concrete.void doIt()");
  }
  
  public void doMore()
  {
    System.out.println("Concrete.void doMore()");
  }
}