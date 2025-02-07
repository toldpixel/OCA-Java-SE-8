// Z:\JAV1\examples\10_DeclareClassMembers

import pack.*;

public class UnterPrivate extends Ober
{
  // @Override
  private void operation1()
  {
    System.out.println("UnterPrivate.operation1()");
    // super.operation1();
  }

  // @Override
  private void operation2()
  {
    System.out.println("UnterPrivate.operation2()");
    // super.operation2();
  }

  /*
  @Override
  private void operation3()
  {
    System.out.println("UnterPrivate.operation3()");
    super.operation3();
  }
  // attempting to assign weaker access privileges
  */

  /*
  @Override
  private void operation4()
  {
    System.out.println("UnterPrivate.operation4()");
    super.operation4();
  }
  // attempting to assign weaker access privileges
  */
}