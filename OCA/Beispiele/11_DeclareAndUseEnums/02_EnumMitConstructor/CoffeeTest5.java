// Z:\JAV1\examples\11_DeclareAndUseEnums\02_EnumMitConstructor

enum CoffeeSize5
{
  BIG(8),
  HUGE(10),
  OVERWHELMING(16) 
  {
    public String getLidCode()
    {
      return "A";
    }
  };
  
  CoffeeSize5(int ounces)
  {
    this.ounces = ounces;
  }
  
  private int ounces;
  
  public int getOunces()
  {
    return ounces;
  }
  
  public String getLidCode()
  {
    return "B";   // Defaultwert
  }
}

class Coffee5
{
  CoffeeSize5 size;
}

public class CoffeeTest5
{
  public static void main(String[] args)
  {
    Coffee5 drink1 = new Coffee5();
    drink1.size = CoffeeSize5.BIG;
    System.out.println(drink1.size + " " + drink1.size.getLidCode());

    drink1.size = CoffeeSize5.OVERWHELMING;
    System.out.println(drink1.size + " " + drink1.size.getLidCode());
  }
}