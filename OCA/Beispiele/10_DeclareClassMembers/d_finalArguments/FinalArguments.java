// Z:\JAV1\examples\10_DeclareClassMembers\d_finalArguments

public class FinalArguments
{
  public static void main(String[] args)
  {
   new FinalArguments().doIt(5);
  }
  
  private int doIt(final int x)
  {
    // x = 5;
    // error: final parameter x may not be assigned
    return x;
  }
}