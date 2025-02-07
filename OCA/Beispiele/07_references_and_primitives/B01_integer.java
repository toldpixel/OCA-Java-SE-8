// 1_java_building_block\07_references_and_primitives 

public class B01_integer
{
  static int i1, i2, i3, i4, i5, i6, i7, i8, i9, i10;
  
  public static void main(String[] args)
  {
    i1 = 20;            // ganzzahliges Literal
    System.out.println(i1);
    
    i2 = 020;           // Oktal 16dez (führende 0)
    System.out.println(i2);

    i3 = 007;           // Oktal 7dez (führende 0)
    System.out.println(i3);

    // i4 = 0815;          // Oktal 7dez (führende 0)
    // System.out.println(i4);

    i5 = 0x20;          // Hex 7dez (führende 0x)
    System.out.println(i5);

    i6 = 0xAFFE;        // Hex 45054dez (führende 0x)
    System.out.println(i6);

    i7 = 0xaffe;        // Hex 45054dez (führende 0x)
    System.out.println(i7);

    i8 = 2147483647;    // Größte int
    System.out.println(i8);

    // i9 = 2147483648;    // Zahl zu groß
    i9 = Integer.MAX_VALUE + 1;
    System.out.println(i9);
    
    // i10 = 1 / 0; // ArithmeticException: / by zero
    System.out.println(i10);
  }
}
