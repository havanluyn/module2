package animalsandtransport;

public abstract class Machine {
    private String fuel;
    private String speed;
    private double vanToc;

    public Machine(String fuel, String speed, double vanToc) {
        this.fuel = fuel;
        this.speed = speed;
        this.vanToc = vanToc;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }
    public abstract void howToDrive();
}
