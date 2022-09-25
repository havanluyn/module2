package animalsandtransport;

public class Car extends Machine implements Runable {

    public Car(String fuel, String speed, double vanToc) {
        super(fuel, speed, vanToc);
    }

    @Override
    public void howToDrive() {
        System.out.println("Dap chan ga");
    }

    @Override
    public String run() {
        return "Chay bang xang";
    }
}
