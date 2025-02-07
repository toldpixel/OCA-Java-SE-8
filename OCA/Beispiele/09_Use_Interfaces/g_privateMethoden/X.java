// Z:\JAV1\examples\09_Use_Interfaces\g_privateMethoden

public interface X 
{
  String text = "Methode m() aus X";
  
  default void m()
  {
    System.out.println(getText());
  }
  
  private String getText()
  {
    return text;
  }
}

// In Java8 können Interfaces KEINE private Methoden haben!