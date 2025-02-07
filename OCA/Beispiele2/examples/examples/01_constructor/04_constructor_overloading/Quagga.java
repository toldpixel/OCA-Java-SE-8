// Z:\JAV2\examples\01_constructor\04_constructor_overloading

import java.util.Arrays;

public class Quagga extends Animal
{
  public Quagga()
  {
    this(4);  // Quagga(int)
    // this im constructor ruft ein weiteren constructor
    // der gleichen Klasse auf
    System.out.println("public Quagga()");
  }
  
  public Quagga(int age)
  {
    super(age);
    System.out.println("public Quagga(int age)");
  }
  
  public Quagga(String name)
  {
    super(name);
    System.out.println("public Quagga(String name)");
  }
  
  public Quagga(String name, int age)
  {
    super (name, age);
    // this(age);
    // this(name);
    System.out.println("public Quagga(String name, int age)");
  }
  
  public Quagga(int age, String name)
  {
    this(name, age);
    System.out.println("public Quagga(int age, String name)");
  }
  
  public Quagga(String... arr)
  {
    super(Arrays.toString(arr), arr.length);
  }
  
  public String toString()
  {
    return "Quagga[age=" + getAge() +
           ",name="      + getName() + "]";
  }
}