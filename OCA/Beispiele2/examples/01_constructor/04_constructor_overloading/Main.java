// Z:\JAV2\examples\01_constructor\04_constructor_overloading

public class Main
{
  static Quagga q1;
  
  public static void main(String[] args)
  {
    if (args.length == 0)
      q1 = new Quagga();
    else if (args.length == 1)
      if (isInt(args[0]))
        q1 = new Quagga(Integer.parseInt(args[0]));
      else
        q1 = new Quagga(args[0], args[0].length());
    else
      if (isInt(args[0]))
        q1 = new Quagga(Integer.parseInt(args[0]), args[1]);
      else if (isInt(args[1]))
        q1 = new Quagga(args[0], Integer.parseInt(args[1]));
      else
        q1 = new Quagga(args);
    
    System.out.println(q1);
  }
  
  private static boolean isInt(String s)
  {
    for (int i = 0; i < s.length(); i++)
      if (s.charAt(i) < '0' || s.charAt(i) > '9')
        return false;
      
    return true;
  }
}