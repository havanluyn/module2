package animalsandtransport;

public class Dog extends Animals implements Runable, Barkable {

    public Dog(String name, String color) {
        super(name, color);
    }

    @Override
    public String makeSound() {
        return "Gau Gau";
    }

    @Override
    public String bark() {
        return "Gau Gau";
    }

    @Override
    public String run() {
        return "Chay bang 4 chan";
    }
}
