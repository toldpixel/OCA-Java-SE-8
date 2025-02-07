package pack;

public class Super {
    private static Super sup = null;

    protected Super()
    {
        System.out.println("protected Super()");
    }

    protected Super getSuper()
    {
        return new Super();
    }

    public static Super factory() {
        if(sup == null)
            sup = new Super();

        return sup;
    }
}