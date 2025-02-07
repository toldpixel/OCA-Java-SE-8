class BadFoodException extends Exception {

}


class MyException {
    public static void main(String[] args) {
        try {
            checkFood(args[0]);
        } catch(BadFoodException e){
            System.out.println("Bad food eaten!");
        }
        
    }

    static void checkFood(String s) throws BadFoodException {
        if(s.equals("apples") || s.equals("oranges")) {
            throw new BadFoodException();
        } else {
            System.out.println("I like the food!.");
        }
    }
}