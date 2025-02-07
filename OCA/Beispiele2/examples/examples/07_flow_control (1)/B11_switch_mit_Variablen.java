// Z:\JAV2\examples\07_flow_control

public class B11_switch_mit_Variablen
{
  static final int y = 1; // B11_util.getY();;
  
  public static void main(String[] args)
  {
    int    ziffer = 0;
    String text   = "";
    
    // Der erste Parameter wird an die Variable ziffer zugewiesen
    // if (args.length > 0)
    //   ziffer = Integer.parseInt(args[0]);
    
    // Das Argument in den Klammern von switch muss
    // int-kompatibel oder String sein.
    // int-kompatibel sind byte, short, char, int und enum.
    
    // int y = 1;
    // Variablen im switch-case müssen effektiv final sein.
    // final int y = 1;
    
    switch (ziffer)
    {
      case y:  text += "ok";
               break;
      case 2:  text += "... nicht";
               break;
      default: text = "unzul\u00E4ssig";
    }
    
    System.out.println("Text: " + text);
  }
  
  static
  {
    // y = 1;
    // y = B11_util.getY();
  }
}

class B11_util
{
  public static int getY()
  {
    return 1;
  }
}