// Z:\JAV2\examples\07_flow_control

public class B10_switch_mit_String
{
  public static void main(String[] args)
  {
    String text;
    
    // Das Argument in den Klammern von switch muss
    // int-kompatibel oder String sein.
    // int-kompatibel sind byte, short, char, int und enum.
    
    switch (args[0])
    {
      case "1":  text = "ok";
                 break;
      case "2":  text = "... nicht";
                 break;
      default:   text = "unzul\u00E4ssig";
    }
    
    System.out.println("Text: " + text);
  }
}