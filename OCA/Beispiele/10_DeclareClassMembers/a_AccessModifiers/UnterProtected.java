// Z:\JAV1\examples\10_DeclareClassMembers

import pack.*;

public class UnterProtected extends Ober
{
  // @Override
  protected void operation1()
  {
    System.out.println("UnterProtected.operation1()");
    // super.operation1();    has private access in Ober
  }

  // @Override
  protected void operation2()
  {
    System.out.println("UnterProtected.operation2()");
    // super.operation2();    is not public in Ober
  }

  @Override
  protected void operation3()
  {
    System.out.println("UnterProtected.operation3()");
    super.operation3();
  }
  
  /*
  @Override
  protected void operation4()
  {
    System.out.println("UnterProtected.operation4()");
    super.operation4();
  }
  // attempting to assign weaker access privileges
  */
}