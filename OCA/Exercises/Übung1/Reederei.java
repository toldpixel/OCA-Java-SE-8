public class Reederei {
    public static void main(String[] args) {
        Schiff schiff1 = new Schiff();
        Seemann s1 = new Seemann();
        Seemann s2 = new Seemann();
        Container c1 = new Container();
        Container c2 = new Container();
        Palette p1 = new Palette();
        Palette p2 = new Palette();
        Palette p3 = new Palette();


        s1.setName("Zambe");
        s1.setGehalt(40000);

        s1.setName("Tom");
        s1.setGehalt(30000);

        p1.setLadung("Aluminium");
        p1.setMasse(1500);
        p1.setWert(5000);

        p2.setLadung("Kupfer ");
        p2.setMasse(200);
        p2.setWert(10000);

        p3.setLadung("Plastik");
        p3.setMasse(1000);
        p3.setWert(3000);

        c1.setEigenMasse(3000);
        c1.setZielHafen("Hamburg");
        c1.belegePlatz(1, p1);
        c1.belegePlatz(2, p2);

        c2.setEigenMasse(3000);
        c2.setZielHafen("Hong-Kong");
        c2.belegePlatz(1, p3);
        c2.belegePlatz(2, p2);

        schiff1.setEigenMasse(50000);
        schiff1.setKapitaen(s1);
        schiff1.setMaschinist(s2);
        schiff1.beladePlatz1(c1);
        schiff1.beladePlatz2(c2);

        ausgabe(schiff1);
    } 

    public static void ausgabe(Schiff schiff) {
        System.out.printf("Schiffsgewicht: %d Tonnen  Gesamt:%d Tonnen",schiff.getEigenMasse(), schiff.gibGesamtMasse());
    }
}