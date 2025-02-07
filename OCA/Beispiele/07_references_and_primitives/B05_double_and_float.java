// 1_java_building_block\07_references_and_primitives 

public class B05_double_and_float
{
  public static void main(String[] args)
  {
    double d1, d2, d3, d4, d5, d6, d7, d8, d9;
    double d10, d11,  d12, d13, d14, d15, d16;
    long   x1, x2;
    int    i1, i2, i3, i4;
    
     d1 = 1000.0;     // Komma-Zahl ist double
     System.out.println(d1);
    
     d2 = 1000.;      // Null nach Punkt kann entfallen
     System.out.println(d2);
     
     d3 = 1E3;        // Eins mal (zehn hoch drei)
                      // Mantisse = 1, Exponent = 3
     System.out.println(d3);
     
     d4 = 1e3;        // kleines e geht auch
     System.out.println(d4);
     
     d5 = 0.1e4;
     System.out.println(d5);
     
     d6 = .1e4;       // Null vor Komma kann entfallen
     System.out.println(d6);
     
     d7 = 10000e-1;   // exponent kann auch negativ sein
     System.out.println(d7);
     
     d8 = 1000;       // Typumwandlung int zu double
     System.out.println(d8);
     
     d9 = 1000D;      // double-Literal
    d10 = 1000d;      // auch 
    
    x1  = 3_333_333_333_333_333_333L;
    d11 = x1;
    x2  = (long) d11;
    
    System.out.println(x1);
    System.out.println(d11);
    System.out.println(x2);
    
    d12 = Double.MAX_VALUE;
    d13 = Double.MIN_VALUE;
    System.out.println(d12);
    System.out.println(d13);
    
    d14 = 1.0 / 0;
    System.out.println(d14);
    
    d15 = d14 / d13;
    System.out.println(d15);
     
    d16 = d14 / d12;
    System.out.println(d16);
    
    float f1, f2, f3, f4;
    
    // f1 = 1000.0;   // Komma-Zahl ist double
    // System.out.println(f1);
    
    f2 = 1000.0F;
    System.out.println(f2);
    
    f3 = 1000.0f;
    System.out.println(f3);
    
    f4 = 100_000_005F;
    System.out.println(f4);
     
     /*
     // ---------------------------------------------
     Object               o  = new B05_double_and_float();
     B05_double_and_float df = (B05_double_and_float) o;
     String               s  = (String) o;
     */
  }
}