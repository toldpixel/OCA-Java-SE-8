package spbriefe;

import stdbriefe.*;

public class Wertbrief extends Brief implements Wertsendung {
    public int getWert() {
        return 500;
    }
}
