// Z:\JAV1\examples\11_DeclareAndUseEnums\01_Declaring_Enums

class Coffee2
{
  // enum in der Klasse deklariert
  enum CoffeeSize {BIG, HUGE, OVERWHELMING}; // optional, wenn kein
                                             // weiteren code kommt
  CoffeeSize size;
}

public class CoffeeTest2
{
  public static void main(String[] args)
  {
    Coffee2 drink = new Coffee2();
    drink.size = Coffee2.CoffeeSize.BIG;
  }
}