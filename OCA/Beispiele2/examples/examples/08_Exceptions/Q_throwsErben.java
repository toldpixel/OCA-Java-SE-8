// Z:\JAV2\examples\08_Exceptions

public class Q_throwsErben
{
  public static void main(String[] args)
  {
    Q_super q_super = new Q_sub();
    try
    {
      q_super.operation3();
      // Muss behandelt werden, throws Exception....
    }
    catch (Exception e) { }
    
    try
    {
      new Q_super().operation4();
    }
    catch (Q_Exception_C qc)
    {
      System.out.println(qc.doMore());
    }
    catch (Q_Exception_A qa)
    {
      System.out.println(qa.doIt());
      try
      {
        q_super.operation4();
      }
      catch (Q_Exception_A q)
      {
        q.doIt();
      }
    }
  }
}

class Q_super
{
  public void operation1() throws Exception {}
  public void operation2() throws Exception {}
  public void operation3() throws Exception {}
  public void operation4() throws Q_Exception_A 
  {
    throw new Q_Exception_A();
  }
  public void operation5() throws Exception {}
  public void operation6() throws RuntimeException {}
  public void operation7() {}
  public void operation8() {}
}

class Q_sub extends Q_super
{
  public void operation1() {};
  public void operation2() throws Exception {}
  // public void operation3() throws Throwable {}
  /*
      Die Unterklasse Q_sub darf keine Oberklasse des Oberklassenexception werfen, weil das Unterklassenobjekt an eine Variable typisiert auf die Oberklasse zugewiesen werden darf.
  */
  // public void operation4() throws Q_Exception_B {}
  /*
      geht nicht, weil der compiler nicht garantieren kann, dass Q_Exception_B alles kann, was Q_Exception_A kann.
  */
  public void operation4() throws Q_Exception_C 
  {
    throw new Q_Exception_C();
  }
  // geht, weil Q_Exception_C eine Unterklasse von Q_Exception_A ist.
  public void operation5() throws RuntimeException {}
  // public void operation6() throws Exception {}
  public void operation7() throws RuntimeException {}
  // public void operation8() throws Exception {}
}

class Q_Exception_A extends Exception
{
  public String doIt()
  {
    return "Q_Exception_A";
  }
}

class Q_Exception_B extends Exception
{
  public String doSomething()
  {
    return "Q_Exception_B";
  }
}

class Q_Exception_C extends Q_Exception_A
{
  public String doMore()
  {
    return "Q_Exception_C";
  }
}