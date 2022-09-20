package inheritance;

public class BaiTap1 {
    public class Circle{
        public double radius;
        public String color;

        public Circle(double radius, String color) {
            this.radius=0.1;
            this.color="color";
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }
        public double getArea(){
            return this.radius*this.radius*Math.PI;
        }
        public String toString(){
            return "A Circle with radius of"+ this.radius +" and Area of "+this.getArea();
        }
    }
    public class Cylinder extends Circle{
        private double height;

        public Cylinder(double radius, String color, double height) {
            super(radius, color);
            this.height = height;
        }

        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {
            this.height = height;
        }

        public double theTich(){
            return this.getArea()*this.height;
        }
        public String toString(){
            return "A Cylinder with radius of"+ this.getRadius() +" ,height of "+this.getHeight()+" and the tich "+ this.theTich();
        }
    }
}
