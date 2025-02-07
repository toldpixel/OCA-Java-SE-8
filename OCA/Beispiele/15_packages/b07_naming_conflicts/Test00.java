// Z:\JAV1\examples\15_packages\b07_naming_conflicts

import packageA.*;

public class Test00
{
  public static void main(String[] args)
  {
    ClassA ca = new ClassA();
  }
}

/*
    error: cannot access ClassA
        ClassA ca = new ClassA();
        ^
      bad class file: .\packageA\ClassA.class
        class file contains wrong class: packageC.ClassA
*/