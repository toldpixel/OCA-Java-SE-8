// Z:\JAV1\examples\09_Use_Interfaces\g_privateMethoden

public class B implements X
{
  public static void main(String[] args)
  {
    B b = new B();
    b.m();
    
    // b.text = "Anders";
    // Variablen im Interface sind implisit final.
    
    X x = new B();
    x.m();
  }
}

// Diese Klasse compiliert und läuft ab Java9, in Java8 aber nicht!