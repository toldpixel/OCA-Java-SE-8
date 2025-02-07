// Z:\JAV1\examples\11_DeclareAndUseEnums\01_Declaring_Enums

public class CoffeeTest3
{
  public static void main(String[] args)
  {
    // enum CoffeeSize {BIG, HUGE, OVERWHELMING);
    // error: enum types must not be local
    
    Coffee drink = new Coffee();
    drink.size = CoffeeSize.BIG;
  }
}