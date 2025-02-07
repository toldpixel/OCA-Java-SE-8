interface Fahrzeug 
{
    //public abstract void doIT(int x);
        //abstract void doIT(int x);
    void motorStarten(Boolean x); // Darf nicht final sein 
}

class LKW implements Fahrzeug {
    public void motorStarten(Boolean x) // Alle Methoden müssen public sein 
    {
        if(x) {
            System.out.println("Motor gestartet");
        } else {
            System.out.println("Motor aus");
        }
        
    }
}

class Auto implements Fahrzeug {
    public void motorStarten(Boolean x) {
        if(x) {
            System.out.println("Auto Motor gestartet");
        } else {
            System.out.println("Auto Motor aus");
        }
    }
}

public class Starter {
    public static void main(String[] args) {
        Fahrzeug lkw1 = new LKW();
        lkw1.motorStarten(true);

        Fahrzeug auto1 = new Auto();
        auto1.motorStarten(true);
        
        Fahrzeug[] Arr = {lkw1, auto1};

        for(Fahrzeug x : Arr) {
            x.motorStarten(true);
        }
    }
}