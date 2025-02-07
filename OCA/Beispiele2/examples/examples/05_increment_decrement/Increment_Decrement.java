// Z:\JAV2\examples\05_increment_decrement

public class Increment_Decrement
{
  public static void main(String[] args)
  {
    int i, j;
    
    i = 1;
    j = 0;
    j = i++;
    System.out.println("i = " + i);
    System.out.println("j = " + j);
    System.out.println();
    // Die Inkrementierung findet im Speicher statt unmittelbar
    // nachdem der gespeicherte Wert von "i" in dem
    // Prozessorregister kopiert wird.
    
    i = 1;
    j = 0;
    i = i++;
    System.out.println("i = " + i);
    System.out.println();
    // Der Wert von "i" bleibt, weil nach dem Increment
    // der gelesene Wert wieder zugewiesen wird.
    i = ++i;
    System.out.println("i = " + i);
    System.out.println();
    // Beim preincrement wird erst hochgezählt, un dann gelesen.
    
    i = 1;
    j = 0;
    j = i + i++ + i++;
    //  1 + 1   + 2   = 4
    System.out.println("i = " + i); // 3
    System.out.println("j = " + j); // 4
    System.out.println();

    i = 1;
    j = 0;
    j = i++ + ++i;
    //  1   +   3 = 4
    System.out.println("i = " + i); // 3
    System.out.println("j = " + j); // 4
    System.out.println();

    i = 1;
    j = 0;
    j = ++i + ++i;
    //    2 +   3 = 5
    System.out.println("i = " + i); // 3
    System.out.println("j = " + j); // 5
    System.out.println();

    i = 4;
    j = 0;
    long x = 0;
    j = (int)(++i + ++x - (i-- * --i));
    //          5     1    5       3
    System.out.println("i = " + i); // 3
    System.out.println("j1 = " + j); // -9
    System.out.println();
    
    j = (int)(++i + ++x - i-- * --i);
    //          3     1   4       2
    System.out.println("i = " + i); // 3
    System.out.println("j2 = " + j); // -2
    System.out.println();
    
    /*
        Pre- und Post-Increment und -Decrement werden unmittelbar
        vor bzw. nach dem lesen des Werts ausgeführt.
        Ausdrücke (statements) werden von links nach rechts ausgeführt.
        Geklammerte Ausdrücke gelten als einzelner Operand,
        und werden von links nach rechts zuerst evaluiert.
    */
    
    int y = 100 + 50 / 25 - 10;
    System.out.println("y = " + y);
  }
}