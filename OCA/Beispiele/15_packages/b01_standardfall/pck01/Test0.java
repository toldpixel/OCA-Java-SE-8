// Z:\JAV1\examples\15_packages\b01_standardfall

package pck01;

// Die package-Anweisung MUSS die erste nicht-Kommentar-Zeile
// in der Quellcode-Datei sein

/*
    Die Klasse Test0 befindet sich im package pck01

    Sie kann im Verzeichnis pck01 mit
    
          javac Test0.javac
        
    oder aus dem übergeordneten Verzeichnis mit
    
          javac pck01\Test0.javac
    oder  javac pck01/Test0.javac
    
    compilert werden.
    
    Die Klasse kann NICHT aus dem package gestartet werden,
    sondern NUR aus dem übergeordneten Verzeichnis mit
    
          java pck01/Test0
    oder  java pck01.Test0
    
    java sucht packages ab dem aktuellen Arbeitsverzeichnis,
    oder ab dem im System hinterlegten java Classpath.
*/

public class Test0
{
  public static void main(String[] args)
  {
    System.out.println("Test0");
  }
}