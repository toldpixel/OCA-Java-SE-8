import pack.*;

public class Sub extends Super {
    Super meinSuper;

    public static void main(String[] args) {
        //Super sup1 = new Super();
        
        Sub sub1 = new Sub();
        Super sup1 = sub1.getSuper();
        Super sup2 = Super.factory();
        System.out.println(sup2);
        Super sup3 = Super.factory();
        System.out.println(sup3);
    }

    public Super getSuper() {
        return super.getSuper();
    }

    //Dies ist ein default-constructor. Falls kein constructor im 
    // code steht, wird er vom compiler geschrieben.
    public Sub(int i) {
        super();
    }
}