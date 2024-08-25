public class Ship {
    private String name;
    private int size; //size of ship expressed as represented by arbitrary number
    private double speed; //speed of ship in nebulous measurement

    public Ship(String name, int size, double speed) {
        this.name = name;
        this.size = size;
        this.speed = speed;
    }

    //getters and setters
    public String getName() {
        return name;
    }
    public int getSize() {
        return size;
    }
    public double getSpeed() {
        return speed;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "name= " + name + ", size= " + size + ", speed= " + speed;
    }
}
