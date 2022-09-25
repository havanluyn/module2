package animalsandtransport;

public class Fish extends Animals implements Swimable {

    public Fish(String name, String color) {
        super(name, color);
    }

    @Override
    public String makeSound() {
        return null;
    }

    @Override
    public String swim() {
        return "Vay duoi, vay";
    }
}
