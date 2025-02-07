// 1_java_building_block\07_references_and_primitives 

public class B02_byte_and_short
{
  public static void main(String[] args)
  {
    byte b1, b2, b3, b4, b5, b6, b7, b8;
    
    b1 = 1;
    System.out.println(b1);
    
    int i = 1;
 // b2    = i; // incompatible types: possible lossy conversion
 
    b2 = 127;
    System.out.println(b2);
    
 // b3 = 128;
 // System.out.println(b3);

    b4 = (byte) 128;
    System.out.println(b4);
    
    b5 = 1 + 1;
    System.out.println(b5);
    
 // b6 = 127 + 1;
 // System.out.println(b6);

 // b7 = b1 + b1;
 // System.out.println(b7);
    /*
        Das Ergebniss von ganzzahlige Operationen ist IMMER int,
        ausser wenn eins der Operanden den Typ long hat. Dann ist
        das Ergebnis auch long.
    */
    
    short s1, s2, s3, s4, s5, s6, s7;
    
    s1 = 1;
    System.out.println(s1);
    
    s2 = 32767;
    System.out.println(s2);
    
 // s3 = 32768;
 
    s4 = (short) 32768;
    System.out.println(s4);
    
    s5 = 1 + 1;
    System.out.println(s5);
    
    // s6 = 32767 + 1;
    
    // s7 = s1 + s1;
  }
}

