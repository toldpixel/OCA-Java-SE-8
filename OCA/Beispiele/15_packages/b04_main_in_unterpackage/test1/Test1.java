// Z:\JAV1\examples\15_packages\b04_main_in_unterpackage

package test1;

public class Test1
{
  public static void main(String[] param)
  {
    System.out.println("param hat " + param.length + " Elemente.");
    
    for (String s : param)
      System.out.println(s);
  }
  
  {
    System.out.println(getClass().getName());
  }
}