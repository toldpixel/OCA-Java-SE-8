// Z:\JAV2\examples\07_flow_control

public class B02_for
{
  public static void main(String[] args)
  {
    // for (;;);  // endlosschleife
    // error: unreachable statement - beim nächsten Statement
    
    // Der Kopf der for-Schleife enthält drei Abschnitte:
    // Anweisung(en); Bedingung; Anweisung(en)

    // for (int i = 0, j = 10; i++ < j; System.out.println(i)) ;
    
    // Mehrere Anweisungen sind möglich. Sie werden (nur im Kopf
    // der for-Schleife) durch Komma getrennt. Sonst immer ";".
    
    // binominalkoeffizienten bis 100
    // for (int i = 1, j = 0; (i + j) <= 100; j += i++, System.out.println(j));
    
    // kürzer
    for (int i = 1, j = 0; (j += i++) <= 100; System.out.println(j));
  }
}