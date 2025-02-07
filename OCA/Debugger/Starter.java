public class Starter {
    public static void main(String args[]) {
      int plan = 6;
      plan = plan++ + plan++ + --plan + --plan;
      System.out.println(plan);
    }
}