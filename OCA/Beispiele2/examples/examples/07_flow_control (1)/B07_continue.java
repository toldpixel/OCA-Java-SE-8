// Z:\JAV2\examples\07_flow_control

public class B07_continue
{
  public static void main(String[] args)
  {
    for (int i = 1; i <= 10; i++)
    {
      System.out.println(i + ": erster Teil");
      
      if (i == 5) break;
      if (i >= 3) continue;
      
      System.out.println(i + ": zweiter Teil");
    }
  }
}

/*
    for (alpha, beta, gamma)
    {
      delta;
      if (sigma) continue;
      omega;
    }
    
    A. alpha, beta, delta, sigma, omega, gamma, beta ...
    B. alpha, beta, delta, sigma, gamma, beta ...
*/