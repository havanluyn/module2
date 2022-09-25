package animalsandtransport;

public class Plane extends Machine implements Flyable {


    public Plane(String fuel, String speed, double vanToc) {
        super(fuel, speed, vanToc);
    }

    @Override
    public String fly() {
        return "Dung dong co";
    }

    @Override
    public void howToDrive() {
        System.out.println("Phi cong lai may bay");
    }
}
