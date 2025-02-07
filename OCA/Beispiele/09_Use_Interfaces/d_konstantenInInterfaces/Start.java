// Z:\JAV1\examples\09_Use_Interfaces\a_einfachesInterface

public class Start
{
  static int MAX = 5000;
  
  public static void main(String[] args)
  {
    if (args.length > 0)
      MAX = Integer.parseInt(args[0]);
    
    Post    post     = new Post();
    
    Sendung sendung1 = new Brief();
    Sendung sendung2 = new Paket();
    Sendung sendung3 = new WertBrief();
    
    post.verschicke(sendung1);
    post.verschicke(sendung2);
    post.verschicke(sendung3);
  }
  
  public static int getMax()
  {
    return MAX;
  }
}