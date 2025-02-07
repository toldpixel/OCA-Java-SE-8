// Z:\JAV1\examples

abstract class Canine extends Animal
{
  public void askAnimal()
  {
    // System.out.println("Canine");
    System.out.println(getClass().getName());
    System.out.println(super.getClass().getName());
  }
}