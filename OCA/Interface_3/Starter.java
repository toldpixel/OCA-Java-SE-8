interface Bouncable {
    public int bounce();
    public void setBounceFactor();
} 


class Ball implements Bouncable {
    public int bounce() { return 0;}
    public void setBounceFactor() {}
}