// Z:\JAV1\examples\16_overriding_overloading\B03_Supertype_invocation

class Horse extends Animal
{
  int    legs  = 4;
  String color = "brown";
  String name  = "Jolly Jumper";
  
  public void eat()
  {
    System.out.println("Horse eating hay, oats, and horse treats");
  }
  
  public String printYourself()
  {
    return super.printYourself() + ", specifically a horse!";
  }
  
  @Override
  public String toString()
  {
    return "Horse["  +
           "name="   + name  +
           ",color=" + color +
           ",legs="  + legs  +
           "]";
  }
  
  // @Override
  public void setAttributes(String color, int legs, String name)
  {
    System.out.println("Horse:l=" + legs + ", c=" + color + ", n=" + name);
  }
}