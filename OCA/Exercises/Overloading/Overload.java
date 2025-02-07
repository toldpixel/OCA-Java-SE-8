public class Overload {
    public static void main(String[] args) {
        byte primitiveByte = 42;
        Byte byteObjekt = new Byte(primitiveByte);
        long primitiveLong = 43;

        rechne(primitiveByte);
    }

    static void rechne(int zahl) {
        System.out.println("void rechne (int zahl");
    }
    /*
        Wenn eine Methode mit einem primitiven Typ als Parameter passt und auch eine Methode, bei der Boxing nötig ist, dann wird 
        immer die Methode ohne Boxing bevorzugt.

    */

    static void rechne(Byte zahl) {
        System.out.println("void rechne (Byte zahl");
    }

    static void schreib(byte zahl) {
        System.out.println("void schreib(byte zahl)");
    }

    static void schreib(Number zahl) {
        System.out.println("void schreib(Number zahl)");
    }
}
