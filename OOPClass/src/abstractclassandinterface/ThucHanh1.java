package abstractclassandinterface;

public class ThucHanh1{
    public static void main(String[] args) {
        Animals[] animals = new Animals[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animals animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                Edible edibler = (Chicken) animal;
                System.out.println(edibler.howToEat());
            }
        }
        Edible animal1=new Chicken();
        System.out.println(animal1.howToEat());
    }
    public static abstract class Animals {
        public abstract String makeSound();
    }
    public static class Tiger extends Animals{
        public String makeSound(){
            return "Growwww";
        }
    }
    public static class Chicken extends Animals implements Edible{
        public String makeSound(){
            return "o o o";
        }
        public String howToEat(){
            return "Luoc cham muoi tieu";
        }
    }
    public abstract class Fruit implements Edible{
    }
    public class Orange extends Fruit{
        @Override
        public String howToEat() {
            return "Cham muoi ot";
        }
    }
    public class Apple extends Fruit{
        @Override
        public String howToEat() {
            return "An luon";
        }
    }
}
