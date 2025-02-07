// Z:\JAV1\examples\12_encapsulation

class Foo
{
  public int width  = 16;
  public int height = 9;
  public void setSize(int widthNum)
  {
    width  = widthNum;
    height = 9 * widthNum / 16;
  }
}