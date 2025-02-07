// Z:\JAV2\examples\01_constructor\04_constructor_overloading

public class Animal
{
  private int    age;
  private String name;
  
  public Animal(int age)
  {
    super();
    this.age = age;
    System.out.println("public Animal(int age)");
  }
  
  public Animal(String name)
  {
    this.name = name;
    System.out.println("public Animal(String name)");
  }
  
  public Animal(String name, int age)
  {
    this(name);
 // this(age);
 // error: call to this must be first statement in constructor
    this.age = age;
    System.out.println("public Animal(String name, int age)");
  }
  
  public int getAge()
  {
    return age;
  }
  
  public String getName()
  {
    return name;
  }
}