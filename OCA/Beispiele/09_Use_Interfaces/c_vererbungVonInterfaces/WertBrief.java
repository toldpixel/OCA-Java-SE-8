// Z:\JAV1\examples\09_Use_Interfaces\c_vererbungVonInterfaces

class WertBrief extends    Brief
                implements WertSendung
{
  public int getWert()
  {
    return 500;
  }
}