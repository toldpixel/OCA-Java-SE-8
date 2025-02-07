// Z:\JAV1\examples\11_DeclareAndUseEnums\03_enumInSwitch

public class EnumInSwitch
{
  private enum Farbe {ROT, GELB, GRUEN};
  
  public static void main(String[] args)
  {
    Farbe farbe = Farbe.GRUEN;
    
    switch (farbe)
    {
      case ROT:
        System.out.println("ROT"); break;
      case GELB:
        System.out.println("GELB"); break;
      case GRUEN:
        System.out.println("GRUEN");
    }
  }
}