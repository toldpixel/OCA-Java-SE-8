package pack;

public class Super {
    private static Super sup = null;

    private Super() {

    }

    public static Super factory() {
        sup = sup == null ? new Super() : sup;
        return sup;
    }
}