// Z:\JAV1\examples\11_DeclareAndUseEnums\02_EnumMitConstructor

enum Waehrung
{
  PFUND(0.85355),
  DOLLAR(1.42621),
  YEN(135.145);
  
  private double faktor;
  
  Waehrung(double faktor)
  {
    this.faktor = faktor;
  }
  
  public double getFaktor()
  {
    return faktor;
  }
  
  public void setFaktor(double faktor)
  {
    this.faktor = faktor;
  }
}

class Test
{
  public static void main(String[] args)
  {
    Waehrung yen = Waehrung.YEN;
    
    System.out.println(yen.getFaktor());
    
    yen.setFaktor(134.258);
    System.out.println(yen.getFaktor());
  }
}