interface Pet {
    public void beFriendly();
}

class Animal {
    void makeNoise() { System.out.println("generic noise"); }
}

class Dog extends Animal implements Pet {
    public void beFriendly() { System.out.println("Dog beFriendly"); }
    void makeNoise() { System.out.println("bark"); }
    void playDead() { System.out.println("over"); }
}


class Beagle extends Dog implements Pet {
    void makeNoise() { System.out.println("beagle Bark"); };
}


class Starter {
    public static void main(String[] args) {
        
        Beagle b = new Beagle();
        Dog a = (Dog) b; 
        a.beFriendly();
    }
}