package Model;

public class Player {
    String name;
    String country;
    int age;
    int points;

    public Player() {

    }

    public Player(String name, String country, int age, int points) {
        this.name = name;
        this.country = country;
        this.age = age;
        this.points = points;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setPoints(int points) {
        this.points = points; 
    }

    public void setCountry(String ct) {
        this.country = ct;
    }

    public String getCountry() {
        return this.country;
    }
}