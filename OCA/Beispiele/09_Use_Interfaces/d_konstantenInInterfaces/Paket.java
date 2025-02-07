// Z:\JAV1\examples\09_Use_Interfaces\a_einfachesInterface

class Paket implements Sendung,
                       Messbar
{
  public double getGewicht()
  {
    return 4.5;
  }
  
  public double getHoehe()
  {
    return 30;
  }
}