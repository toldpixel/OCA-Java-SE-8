import static java.lang.System.out;
import static java.lang.Integer.*;
import static Test.ImportMe.*;

public class MyClassStaticImport {
    public static void main(String[] args) {
        out.println(MAX_VALUE);
        out.println(toHexString(42));
        System.out.println(firstName());
    }
}