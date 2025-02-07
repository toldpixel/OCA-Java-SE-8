// Z:\JAV2\examples\01_constructor\03_default_constructor

package pack;

public class Bar
{
  public Bar(int i)
  {
    super();
    // Wenn im construktor kein weiteren constructor-Aufruf steht,
    // schreibt der compiler super();
  }
}

/*
    Der compiler erstellt KEIN construktor, wenn im code
    irgend ein construktor definiert ist.
*/