package animalsandtransport;

public class Bird extends Animals implements Flyable {

    public Bird(String name, String color) {
        super(name, color);
    }

    @Override
    public String makeSound() {
        return "chiep chiep";
    }

    @Override
    public String fly() {
        return "Dap canh";
    }
}
