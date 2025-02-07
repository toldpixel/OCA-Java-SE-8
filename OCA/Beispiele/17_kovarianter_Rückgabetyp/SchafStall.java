// Z:\JAV1\examples\17_kovarianter_Rueckgabetyp

class SchafStall extends Stall
{
  @Override
  public Schaf gibWas()
  {
    return new Schaf();
  }
}