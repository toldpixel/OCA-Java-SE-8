// Z:\JAV1\examples\18_garbage_collector

public class Bear
{
  static int x;
  
  public Bear()
  {
    System.out.println("Bear! " + x++);
  }
  
  protected void finalize() throws Throwable
  {
    System.out.println("Roar! " + x--);
  }
}