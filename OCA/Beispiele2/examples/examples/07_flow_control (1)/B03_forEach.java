// Z:\JAV2\examples\07_flow_control

public class B03_forEach
{
  public static void main(String[] args)
  {
    String[] strings = {"one", "two", "three", "four", "five"};
    
    for (String temp : strings)
      System.out.println(temp);
    
    for (String temp : strings)
      temp = "changed";
    // Der Wert der Variable temp ist eine Kopie aus dem Array.
    // Daher ändert die Zuweisung nur der Variable, nicht
    // der Inhalt des Arrays.
    
    for (String temp : strings)
      System.out.println(temp);
    
    // B03_eineKlasse[] arr = new B03_eineKlasse[5];
    // B03_eineKlasse[] arr = new B03_eineKlasse[4]{null,null,null,null};
    B03_eineKlasse[] arr = new B03_eineKlasse[]{null,null,null,null};
    
    for (int i = 0; i < arr.length;)
      arr[i++] = new B03_eineKlasse();
    
    for (B03_eineKlasse var : arr)
      System.out.println(var.attribut);
    
    int x = 0;
    for (B03_eineKlasse var : arr)
      var.attribut = x++;

    for (B03_eineKlasse var : arr)
      System.out.println(var.attribut);
  }
}

class B03_eineKlasse
{
  int attribut = 5;
}