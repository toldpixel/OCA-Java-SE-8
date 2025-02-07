// Z:\JAV1\examples\10_DeclareClassMembers

import pack.*;

public class UnterPublic extends Ober
{
  // @Override
  public void operation1()
  {
    System.out.println("UnterPublic.operation1()");
    // super.operation1();    private access in Ober
  }

  // @Override
  public void operation2()
  {
    System.out.println("UnterPublic.operation2()");
    // super.operation2();    is not public in Ober
  }

  @Override
  public void operation3()
  {
    System.out.println("UnterPublic.operation3()");
    super.operation3();
  }

  @Override
  public void operation4()
  {
    System.out.println("UnterPublic.operation4()");
    super.operation4();
  }
}