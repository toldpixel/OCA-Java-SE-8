// Z:\JAV1\examples\06_ImportStatements

// import java.util.ArrayList;
import java.util.*;
// import java.*.*;
// error: ';' expected

public class Main
{
  public static void main(String[] args)
  {
    ArrayList al = new ArrayList();
    
    // al.add("ein Zeichenfolge");
    // error: cannot find symbol
    
    al.add("eine Zechenfolge");
    al.add(21);
    
    java.util.ArrayList<String> als = new java.util.ArrayList<>();
    als.add("eine Zeichenfolge");
    // als.add(new Integer(21));
  }
}