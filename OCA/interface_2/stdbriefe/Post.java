package stdbriefe;

public class Post {
    public void verschicke(Sendung sendung) {
        double gewicht = sendung.getGewicht();
        System.out.println("Gewicht:" + gewicht);

        if(sendung instanceof Messbar) {
            double hoehe = ((Messbar)sendung).getHoehe();
            System.out.println("Hoehe: " + hoehe);
        }
        
    }
}
