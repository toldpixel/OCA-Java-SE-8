// Z:\JAV2\examples\07_flow_control

class B01_block
{
  static int i = 43;
  static B01_block staticBlock = new B01_block();
         int eineZahl = 0;
  
  public static void main(String[] args)
  {
    // Eine Variable gilt in ihrem Block und alle Unterblöcke.
    
    System.out.println("static int i = " + i);
    
    int i = 42;
    System.out.println("       int i = " + i);
    // Die statische Variable i ist verdeckt (hidden)
    
    System.out.println("static int i = " + B01_block.i);
    System.out.println("static int i = " + staticBlock.i);
    System.out.println("static int i = " + new B01_block().i);
    
    EinBlock:   // Das ist ein Label
    {
      System.out.println("static int i = " + i);  // lokale Variable
      System.out.println("static int i = " + B01_block.i); // Klassenvar.
      //  i's sind erreichbar
      
   // int i = 21;
   // error: variable i is already defined
   
      int j = 22;
      System.out.println("       int j = " + j);
      
      int k = -42;
    }
    
 // System.out.println("       int j = " + j);
 // error: cannot find symbol
 
    int j = 23;
    System.out.println("       int j = " + j);
    // Dies ist schlechter Programmierstil. Variable sollten leicht
    // erkennbar und unterschiedlich sein.
    
 // System.out.println("    eineZahl = " + eineZahl);
 // error: non-static variable eineZahl 
 // cannot be referenced from a static context
 
    staticBlock.testBlock();
  }
  
  public void testBlock()
  {
    System.out.println("eineZahl = " + eineZahl);
    
    int eineZahl = 2;
    System.out.println("eineZahl = " + eineZahl);
    
    {
      // int eineZahl = 4;
      // error: variable eineZahl is already defined
      
      int andereZahl = 6;
      System.out.println("andereZahl = " + andereZahl);
    }
    
    int andereZahl = 8;
    System.out.println("andereZahl = " + andereZahl);
    
 // System.out.println(B01_block.EinBlock.k);
 // 
  }
}