// Z:\JAV1\examples\10_DeclareClassMembers

import pack.*;

public class Test extends Ober
{
  public static void main(String[] args)
  {
    Ober ober = new Ober();
    // ober.operation1();   private access in Ober
    // ober.operation2();   not public in Ober
    // ober.operation3();   protected access in Ober
    ober.operation4();
    
    new Test().ask(ober);
    
    UnterPublic up = new UnterPublic();
    up.operation1();
    up.operation2();
    up.operation3();
    up.operation4();
    
    Ober pro = new UnterProtected();
    // pro.operation1();
    // pro.operation2();
    // pro.operation3();
    pro.operation4();

    UnterProtected upr = new UnterProtected();
    upr.operation1();
    upr.operation2();
    upr.operation3();
    upr.operation4();

    UnterDefault def = new UnterDefault();
    def.operation1();
    def.operation2();
    // def.operation3();    has protected access in Ober
    def.operation4();
    
    UnterPrivate pri = new UnterPrivate();
    // pri.operation1();    has private access in UnterPrivate
    // pri.operation2();    has private access in UnterPrivate
    // pri.operation3();    has protected access in Ober
    pri.operation4();
  }
  
  private void ask(Ober ober)
  {
    // ober.operation3();   operation3() has protected access
    super.operation3();
    operation3();
    super.operation4();
    operation4();
  }
  
  @Override
  protected void operation3()
  {
    System.out.println("Test.operation3()");
  }

  @Override
  public    void operation4()
  {
    System.out.println("Test.operation4()");
  }

}