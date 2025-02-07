// Z:\JAV1\examples\10_DeclareClassMembers\b_LocalVariables

public class Foo
{
  public static void main(String[] args)
  {
    // private int x;   error: illegal start of expression
    System.out.println(args.length);
  }
  
  private void doMore()
  {
    // System.out.println(args.length);
    /*
        error: cannot find symbol
        System.out.println(args.length);
                           ^
    */
  }
}