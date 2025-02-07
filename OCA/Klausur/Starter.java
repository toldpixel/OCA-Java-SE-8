abstract class Fahrzeug {
    //Jean-Pierre Tshimanga
    private String marke; 
    private double leistungInKw;

    public void setLeistungInKW(double x) {
        leistungInKw = x;
    }

    public double getLeistungInKW() {
        return leistungInKw;
    }

    public void setMarke(String str) {
        marke = str;
    }

    public String getMarke() {
        return marke;
    }
}

class PKW extends Fahrzeug {
    //Jean-Pierre Tshimanga
    private int anzAchs = 2;
    private int gaenge = 6;
    private int anzSitze = 4;

    public PKW() {
        setLeistungInKW(100);
    }
}

class LKW extends Fahrzeug {
    //Jean-Pierre Tshimanga
    private int anzAchs = 3;
    private int gaenge = 8;
    private int anzSitze = 2;

    public LKW() {
        setLeistungInKW(200);
    }    
}


class Starter {
    //Jean-Pierre Tshimanga
    public static void main(String[] args) {
        String[] markeArr = {"Ford", "Volvo", "Opel", "Tatra", "BMW", "Scania"};

        Fahrzeug[] f1 = new Fahrzeug[6];
        
        for(int i = 0; i < f1.length;i++) {
            f1[i] = i % 2 == 0 ? new PKW() : new LKW(); 
            f1[i].setMarke(markeArr[i]);
        }

        for(Fahrzeug x : f1) {
            System.out.printf("%-15s %s\n",x.getMarke(),x.getLeistungInKW());
        }

        for(Fahrzeug x : f1) {
            if(x instanceof PKW) {
                double result = x.getLeistungInKW() + x.getLeistungInKW() * 0.10;
                x.setLeistungInKW(result);
            }
        }
        System.out.printf("\n\n");
        for(Fahrzeug x : f1) {
            System.out.printf("%-15s %s\n",x.getMarke(),x.getLeistungInKW());
        }
    }
}