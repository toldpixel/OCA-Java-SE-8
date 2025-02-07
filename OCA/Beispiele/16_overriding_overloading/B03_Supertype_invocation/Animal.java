// Z:\JAV1\examples\16_overriding_overloading\B03_Supertype_invocation

class Animal
{
  int    legs;
  String color;
  String name;

  public void eat()
  {
    System.out.println("Generic Animal Eating generically");
    return;
  }
  
  public String printYourself()
  {
    return "I'm an animal";
  }
  
  public void setAttributes(int l, String c, String n)
  {
    System.out.println("Animal:l=" + l + ", c=" + c + ", n=" + n);
  }
}