// Z:\JAV2\examples\07_flow_control

public class B05_doWhile
{
  public static void main(String[] args) throws java.io.IOException
  {
    int gebot = 0;
    int antwort;
    
    do
    {
      gebot += 100;
      
      System.out.println("Gebot: " + gebot);
      System.out.print("Mehr bieten? (j/n): ");
      
      antwort = System.in.read();
      System.in.read();
      System.in.read();
      
    } while (antwort == 'j' && gebot < 1000);
  }
}