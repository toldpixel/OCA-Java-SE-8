class Trasier {
    static String s = "-";
    public static void main(String[] args) {
        go();
        System.out.println(s);
    }

    void go() { s += "s"; }
    { go(); }
    static { go(); }
    static void go() { s += "s"; }
}