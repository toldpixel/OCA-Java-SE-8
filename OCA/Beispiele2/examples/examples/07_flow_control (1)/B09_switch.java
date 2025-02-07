// Z:\JAV2\examples\07_flow_control

public class B09_switch
{
  public static void main(String[] args)
  {
    int    ziffer = 0;
    String text   = "";
    
    // Der erste Parameter wird an die Variable ziffer zugewiesen
    if (args.length > 0)
      ziffer = Integer.parseInt(args[0]);
    
    // Das Argument in den Klammern von switch muss
    // int-kompatibel oder String sein.
    // int-kompatibel sind byte, short, char, int und enum.
    
    switch (ziffer)
    {
      case 1:  text += "ok";
               break;
      case 2:  text += "... nicht";
               break;
      default: text = "unzul\u00E4ssig";
    }
    
    System.out.println("Text: " + text);
  }
}