// Z:\JAV2\examples\07_flow_control

public class B08_ifElse
{
  public static void main(String[] args)
  {
    int x, y = 1;
    
    if (y == 1)
      x = 5;
    else if (y != 1)
      x = 3;
    else
      x = 4;
    
    System.out.println(x);
  }
}

/*
    Bei Initialisierung von Variablen in bedingten Code, muss
    am Ende eine nicht bedingte Initialisierung stehen.
*/