// Z:\JAV2\examples\03_finale_variablen

public class Main
{
  static int zahl;
  
  public static void main(String[] args)
  {
    zahl = Integer.parseInt(args[0]);
    FinaleVariablen f;
    int x = FinaleVariablen.statfinVar2;
    
    System.out.println(FinaleVariablen.statfinVar3);
    
    if (args.length > 1)
      f = new FinaleVariablen(Integer.parseInt(args[1]));
    else
      f = new FinaleVariablen();
    
    System.out.println(f.finObjAttr3);
  }
  
  public int getInt()
  {
    return zahl;
  }
}