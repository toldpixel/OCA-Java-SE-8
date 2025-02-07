// Z:\JAV1\examples\11_DeclareAndUseEnums
// Enum ausserhalb der Klasse deklariert

enum CoffeeSize   // darf nicht private oder protected sein
{
  BIG, HUGE, OVERWHELMING
}

class Coffee
{
  CoffeeSize size;
}

public class CoffeeTest1
{
  public static void main(String[] args)
  {
    Coffee drink = new Coffee();
    drink.size = CoffeeSize.BIG;  // enum ausserhalb
  }
}