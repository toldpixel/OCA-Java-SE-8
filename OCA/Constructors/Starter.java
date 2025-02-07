class Ball {
   public static Ball getBallObj() {
        return new Ball();
   }

    private Ball() {
        System.out.println("Hello Constructor");
    }

    void go() {
        System.out.println("Hello World");
    }
    
}


class Starter {
    public static void main(String[] args) {
        Ball b1 = Ball.getBallObj();
        b1.go();
    }
}