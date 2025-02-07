// Z:\JAV2\examples\01_constructor\03_default_constructor

import pack.*;

public class Foo
{
  public static void main(String[] args)
  {
    Bar bar = new Bar();
  }
}

/*
    Foo.java:9: error: constructor Bar in class Bar cannot be applied to given types;
        Bar bar = new Bar();
                  ^
      required: int
      found: no arguments
      reason: actual and formal argument lists differ in length
    1 error
*/