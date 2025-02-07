package stdbriefe;

public class Starter {
   public static void main(String[] args) {
        Post post = new Post();
        Sendung sendung1 = new Brief();
        Sendung sendung2 = new Paket();
        //Sendung sendung3 = new Wertbrief();

        post.verschicke(sendung1);
        post.verschicke(sendung2);
        //post.verschicke(sendung3);
    } 
}
