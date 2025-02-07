// Z:\JAV1\examples\17_kovarianter_Rückgabetyp

class HuehnerStall extends Stall
{
  @Override
  public Huhn gibWas()
  {
    return new Chicken();
  }
}

class Huhn extends Tier
{
}

class Chicken extends Huhn
{
}
