// Z:\JAV2\examples\04_static_interface_methods

public class Bunny implements Hop, Jump
{
  public static void main(String[] args)
  {
    /*
    System.out.println(getJumpHeight());
    
    Bunny.java:7: error: cannot find symbol
        System.out.println(getJumpHeight());
                          ^
      symbol:   method getJumpHeight()
      location: class Bunny
    1 error
    */
    
    System.out.println(Hop.getJumpHeight());
    System.out.println(Jump.getJumpHeight());
    
    Hop hoppy = new Bunny();
    /*
    System.out.println(hoppy.getJumpHeight());
    
        Bunny.java:22: error: illegal static interface method call
            System.out.println(hoppy.getJumpHeight());
                                                  ^
          the receiver expression should be replaced with the type qualifier 'Hop'
        1 error
    */
    
    System.out.println(hoppy.X);
    System.out.println(Hop.X);
    System.out.println(((Jump)hoppy).Y);
  }
}