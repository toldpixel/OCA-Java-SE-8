public class Autoboxing {
    public static void main(String[] args) {
        int ip = 42;
        setInteger(ip);
    }

    static void setInteger(Integer io) { // Integer Wrapper ip wird zu io Autoboxing
        String is = io.toString();
        System.out.println(is);

        int ip = io; //Auto unboxing
        System.out.println(ip);
    }
}
