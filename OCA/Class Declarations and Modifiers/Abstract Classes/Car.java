abstract class Car {
    private double price;
    private String model; 
    private String year;
    public  abstract void goFast(); // <-- End with Semicolon not curly braces 
    public  abstract void goUpHill();
    public  abstract void impressNeighbors();
}

class Starter {

    public static void main(String[] args) {
        Car firstCar = new Car();       // Abstract cannot be instatiated 
    }
}