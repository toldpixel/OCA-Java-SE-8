// Z:\JAV1\examples\18_garbage_collector

public class Main
{
  public static void main(String[] args) throws InterruptedException
  {
    Bear[] bears = new Bear[1000];
    
    for (int i = 0; i < bears.length; i++)
    {
      bears[i] = new Bear();
      System.gc();
    }

    for (int i = 0; i < bears.length; i++)
    {
      bears[i] = null; // eligible for garbage collection
      System.gc();
    }
    
    Thread.sleep(1000);
  }
}