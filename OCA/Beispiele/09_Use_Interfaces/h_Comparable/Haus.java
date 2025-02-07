// Z:\JAV1\examples\09_Use_Interfaces\h_Comparable

class Haus implements Comparable<Haus>
{
  private int wert;
  private int flaeche;
  
  public Haus(int wert, int flaeche)
  {
    super();
    this.wert    = wert;
    this.flaeche = flaeche;
  }
  
  public int compareTo(Haus haus)
  {
    int abstand = 0;
    abstand = flaeche - haus.flaeche;
    return abstand;
  }
}