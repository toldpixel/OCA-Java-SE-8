// Z:\JAV1\examples\09_Use_Interfaces\a_einfachesInterface

public class Start
{
  public static void main(String[] args)
  {
    Post    post     = new Post();
    
    Sendung sendung1 = new Brief();
    Sendung sendung2 = new Paket();
    Sendung sendung3 = new WertBrief();
    
    post.verschicke(sendung1);
    post.verschicke(sendung2);
    post.verschicke(sendung3);
  }
}