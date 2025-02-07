class Container {
    private int eigenMasse;
    private String zielHafen;
    private Palette[] platz = new Palette[6];

    public void setEigenMasse(int kg) {
        eigenMasse = kg;
    }

    public int getEigenMasse() {
        return eigenMasse;
    }

    public void setZielHafen(String hafen) {
        zielHafen = hafen;
    }

    public String getZielHafen() {
        return zielHafen;
    }

    public void belegePlatz(int nr, Palette palette) {
        platz[nr-1] = palette;
    }

    public Palette raeumePlatz(int nr) {
        Palette tmp = platz[nr-1];
        platz[nr-1] = null;
        return tmp;
    }

    public int gibGesamtMasse() {
        return 0;
    }

    public int gibGesamtWertDerPaletten() {
        return 0;
    }

}