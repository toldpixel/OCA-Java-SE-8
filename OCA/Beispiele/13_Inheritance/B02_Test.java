// Z:\JAV1\examples\13_Inheritance

interface Iface1
{
  default void doIt()
  {
    System.out.println("default void doIt()");
  }
}

interface Iface2 extends Iface1
{
  abstract void doIt();
}

interface Iface3
{
  default void doIt()
  {
    System.out.println("default void doIt()");
  }
}

class B02_Test implements Iface1, Iface3
{
  
}