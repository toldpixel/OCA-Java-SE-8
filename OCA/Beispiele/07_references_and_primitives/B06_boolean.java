// 1_java_building_block\07_references_and_primitives 

public class B06_boolean
{
  public static void main(String[] args)
  {
    boolean b1, b2, b3, b4, b5, b6, b7, b8, b9;
    boolean b10, b11, b12, b13, b14, b15;
    
    b1 = true;    // boolean-Literal true
    System.out.println(b1);
    
    b2 = false;   // boolean-Literal false
    System.out.println(b2);
    
    b3 = 1 <  1;
    System.out.println(b3);

    b4 = 1 >  1;
    System.out.println(b4);

    b5 = 1 <= 1;
    System.out.println(b5);

    b6 = 1 >= 1;
    System.out.println(b6);

    b7 = 1 == 1;  // Prüfen auf gleichheit
    System.out.println(b7);

    b8 = 1 !=  1; // Prüfen auf ungleichheit
    System.out.println(b8);

    b9 = !(1 == 1);
    System.out.println(b9);
    
    b10 = true && true;
    System.out.println(b10);
    b11 = true && false;
    System.out.println(b11);
    
    b12 = true || true;
    System.out.println(b12);
    b13 = true || false;
    System.out.println(b13);
    
    b14 = true ^  true;
    System.out.println(b14);
    b15 = true ^  false;
    System.out.println(b15);
    
  }
}