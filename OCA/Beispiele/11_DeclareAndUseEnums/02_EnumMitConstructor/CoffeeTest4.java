// Z:\JAV1\examples\11_DeclareAndUseEnums\02_EnumMitConstructor

enum CoffeeSize
{
  BIG(8), HUGE(10), OVERWHELMING(16);
  
  CoffeeSize(int ounces)
  {
    this.ounces = ounces;
  }
  
  private int ounces;   // private instanzvariable
  
  public int getOunces()
  {
    return ounces;
  }
}

class CoffeeTest4
{
  CoffeeSize size;
  
  public static void main(String[] args)
  {
    CoffeeTest4 drink1 = new CoffeeTest4();
    drink1.size = CoffeeSize.BIG;
    System.out.println(drink1.size.getOunces());
    
    for (CoffeeSize cs : CoffeeSize.values())
      System.out.println(cs + " " + cs.getOunces());
  }
}