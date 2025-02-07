class Schiff {
    private int eigenMasse;
    private Seemann kapitaen;
    private Seemann maschinist;
    private Container platz1;
    private Container platz2;

    public void setEigenMasse(int kg) {
        eigenMasse = kg;
    }

    public int getEigenMasse() {
        return eigenMasse;
    }

    public void setKapitaen(Seemann chief) {
        kapitaen = chief;
    }

    public Seemann getKapitaen() {
        return kapitaen;
    }

    public void setMaschinist(Seemann matrose) {
        maschinist = matrose;
    }

    public Seemann getMaschinist() {
        return maschinist;
    }

    public void beladePlatz1(Container container) {
        platz1 = container;
    }

    public Container entladePlatz1() {
        return platz1;
    }

    public void beladePlatz2(Container container) {
        platz2 = container;
    }

    public Container entladePlatz2() {
        return platz2;
    }

    public void vonPlatz1UmladenAuf(Schiff ziel, int platz) {
       if(platz == 1) {
            ziel.beladePlatz1(entladePlatz1());
       } else {
            ziel.beladePlatz2(entladePlatz1());
       }
       
    }

    public void vonPlatz2UmladenAuf(Schiff ziel, int platz) {
        if(platz == 1) {
            ziel.beladePlatz1(entladePlatz2());
       } else {
            ziel.beladePlatz2(entladePlatz2());
       }
    }

    public int gibGesamtMasse() {

        return getEigenMasse() + platz1.getEigenMasse() + platz2.getEigenMasse();
    }

    public int gibGesamtWertDerLadung() {
        return 0;
    }
}