// Z:\JAV2\examples\04_static_interface_methods

interface Jump extends Hop
{
  static int Y = 20;
  
  static int getJumpHeight()
  {
    return 42;
  }
}