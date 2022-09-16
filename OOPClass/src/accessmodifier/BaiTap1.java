package accessmodifier;

public class BaiTap1 {
    public static void main(String[] args) {
        Circle circle=new Circle();
        circle.getRadius();
        circle.getArea();
        System.out.println(circle.radius);
    }
    public static class Circle{
        private double radius=1.0;
        private String color="red";
        public Circle(){
        }
        public Circle(double radius){
            this.radius=radius;
        }

        public double getRadius() {
            return radius;
        }

        public double getArea() {
            return radius*radius*3.14;
        }
    }
}
