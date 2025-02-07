// Z:\JAV1\examples\17_kovarianter_Rueckgabetyp

class KuhStall extends Stall
{
  /*
      Die von der Klasse Stall geerbte Operation gibWas() wird hier
      durch eine Operation mit der gleichen Signatur überschrieben.
      
      Die überschreibende Operation hat aber nicht den gleichen
      Rückgabetyp wie die überschriebene Operation.
      
      Wenn eine Operation einen Referenztyp als Rückgabetyp hat,
      dann darf eine uberschreibende Operation auch einen
      Untertyp (Erbe) des vorgegebenen Rückgabetyps zurück geben.
      
      Das ist ein kovarianter Rückgabetyp.
  */
  
  @Override
  public Kuh gibWas()
  {
    return new Kuh();
  }
}