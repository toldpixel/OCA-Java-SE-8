// Z:\JAV2\examples\06_bitoperationen

public class BitOp
{
  public static void main(String[] args)
  {
    // Komplement
    int a = 0b01010101;
    int b = ~a;
    System.out.println("a = " + a + ", " + Integer.toBinaryString(a));
    System.out.println("b = " + b + ", " + Integer.toBinaryString(b));
    
    // Verschiebung
    int c = a;
    int d = c << 2;   // 2 Stellen nach links
    System.out.println("c = " + c + ", " + Integer.toBinaryString(c));
    System.out.println("d = " + d + ", " + Integer.toBinaryString(d));
    
    int e = c >> 2;   // 2 Stellen nach rechts, signiert
    System.out.println("e = " + e + ", " + Integer.toBinaryString(e));

    int f = c >>> 2;   // 2 Stellen nach rechts, unsigniert
    System.out.println("f = " + f + ", " + Integer.toBinaryString(f));
    
    // Logische Verknüpfungen
    int g = 0b11110000;
    int h = 0b10101010;
    
    // AND / UND
    int i = g & h;
    System.out.println("i = " + i + ", " + Integer.toBinaryString(i));

    // OR / ODER
    int j = g | h;
    System.out.println("j = " + j + ", " + Integer.toBinaryString(j));

    // XOR / exclusives ODER
    int l = g ^ h;
    System.out.println("l = " + l + ", " + Integer.toBinaryString(l));
    
    // Prüfzahl
    int da = 0b11110000;
    int db = 0b11001100;
    int dc = 0b10101010;
    //         10010110
    
    int p  = da ^ db ^dc;
    System.out.println("p = " + p + ", " + Integer.toBinaryString(p));
    
    db = da ^ p ^dc;
    System.out.println("db = " + db + ", " + Integer.toBinaryString(db));
    
    // Farben: RGBA
    int m = 0b11110000_11001100_10101010_11000000;
    
    int red   = (m >> 24) & 0xFF;
    System.out.println("red =   " + Integer.toBinaryString(red));
    int green = (m >> 16) & 0xFF;
    System.out.println("green = " + Integer.toBinaryString(green));
    int blue  = (m >> 8) & 0xFF;
    System.out.println("blue =  " + Integer.toBinaryString(blue));
    int alpha  = m & 0xFF;
    System.out.println("alpha = " + Integer.toBinaryString(alpha));

    int n  = red << 24 | green << 16 | blue << 8 | alpha;
    System.out.println("n     = " + Integer.toBinaryString(n));
    
    // Flags
    int f1 = 0b10000;
    System.out.println("flag x = " + Integer.toBinaryString(f1 & m));
    // Einschalten / on
    int o = f1 | m;
    System.out.println("flags  = " + Integer.toBinaryString(o));
    // Umschalten  / toggle
    System.out.println("flagsX = " + Integer.toBinaryString(o ^ f1));
    // Ausschalten / off
    o = o & ~f1; 
    System.out.println("flags  = " + Integer.toBinaryString(o));
  }
}