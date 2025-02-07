// Z:\JAV1\examples\09_Use_Interfaces\a_einfachesInterface

class Post
{
  public void verschicke(Sendung sendung)
  {
    double gewicht = sendung.getGewicht();
    System.out.println("Gewicht: " + gewicht);
  }
}