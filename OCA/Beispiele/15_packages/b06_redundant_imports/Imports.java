// Z:\JAV1\examples\15_packages\b06_redundant_imports

import java.lang.*;
import java.lang.System;
import java.util.*;
import java.util.Random;

public class Imports
{
  public static void main(String[] args)
  {
    System.out.println("class Imports");
    
    Random r = new Random();
    
    for (int x = 0; x < 5; x++)
      System.out.println(r.nextInt(100));
  }
}