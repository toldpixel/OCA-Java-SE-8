class Palette {
    private String ladung;
    private int masse;
    private int wert;

    public void setLadung(String bezeichnung) {
        ladung = bezeichnung;
    }

    public String getLadung() {
        return ladung;
    }

    public void setMasse(int kg) {
        masse = kg;
    }

    public int getMasse() {
        return masse;
    }

    public void setWert(int euro) {
        wert = euro; 
    }

    public int getWert() {
        return wert;
    }
}