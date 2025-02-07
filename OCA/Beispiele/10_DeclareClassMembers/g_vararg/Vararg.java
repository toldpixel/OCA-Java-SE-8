// Z:\JAV1\examples\10_DeclareClassMembers

public class Vararg
{
  String[] arr1, arr2[], arr3[][];
  
  // public static void main(String[] args)
  // public static void main(String... args)
  // public static void main(String args...) geht nicht
  public static void main(String args[])
  {
    op1("one", "two", "three");
    op1(new String[]{"one", "two", "three"});
  }
  
  static void op1(String... args)
  {
    for (String s : args)
      System.out.println(s);
  }
  
  // static void op2(String... args, int x)
  // error: ')' expected
  
  // Die variable Argumentenliste MUSS als letzter Parameter stehen
  static void op3(int x, String... args)
  {
  }
  
  // Overload
  static void op1(String array)
  {
  }
  
  // static void op1(String[] array)
  // error: cannot declare both op1(String[]) and op1(String...)
  {
  }
}