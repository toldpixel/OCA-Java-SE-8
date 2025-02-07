// Z:\JAV1\examples\05_usingMain

public class Main01
{
  public static void main(String... params)
  {
    for (String s : params)
      System.out.println(s);
  }

  static
  {
    main(new String[]{".", "hallo"});
    main("Knut");
    main("Heinz", "irgendwas");
  }
  
  static public void main(String string)
  {
    System.out.println(string);
  }
/*
  public static void main(String[] params)
  {
  }
  */
}

