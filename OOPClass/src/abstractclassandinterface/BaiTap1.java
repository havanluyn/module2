package abstractclassandinterface;


public class BaiTap1 {
    public static void main(String[] args) {
        Shape[] shape=new Shape[5];
        shape[0]=new Circle(2);
        shape[1]=new Circle(0.5);
        shape[2]=new Rectangle(4,5);
        shape[3]=new Circle(4);
        shape[4]=new Rectangle(3,5);
        for (Shape item:shape) {
            if (item instanceof Circle){
                System.out.println(item);
                double percent=Math.random()*(100-1)+1;
                System.out.println(percent);
                ((Circle) item).Resize(percent);
                System.out.println(item);
            }
            else {
                System.out.println(item);
                double percent=Math.random()*(100-1)+1;
                System.out.println(percent);
                ((Rectangle)item).Resize(percent);
                System.out.println(item);
            }
        }
    }
    public static class Shape{
        public String color;
        public boolean filled;
        public Shape(){
            this.color="green";
            this.filled=true;
        }

        public Shape(String color, boolean filled) {
            this.color = color;
            this.filled = filled;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public boolean isFilled() {
            return filled;
        }

        public void setFilled(boolean filled) {
            this.filled = filled;
        }


        public String toString(){
            return "A Shape with color of"+ this.color +" and "+this.filled;
        }
    }
    public static class Circle extends Shape implements Resizeable {
        public double radius;

        public Circle() {
            this.radius = 1.0f;
        }

        public Circle(String color, boolean filled, double radius) {
            super(color, filled);
            this.radius = radius;
        }

        public Circle(double radius) {
            this.radius=radius;
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }
        public double getArea(){
            return this.radius*this.radius*3.14;
        }
        public double getPerimeter() {
            return 2 * radius * Math.PI;
        }

        public String toString(){
            return "A Circle with radius="
                    + getRadius();
        }

        @Override
        public void Resize(double percent) {
            this.radius=radius*(100+percent)/100;
        }
    }
    public static class Rectangle extends Shape implements Resizeable {
        private double width = 1.0;
        private double hight = 1.0;

        public Rectangle() {
        }

        public Rectangle(double width, double length) {
            this.width = width;
            this.hight = hight;
        }

        public Rectangle(double width, double hight, String color, boolean filled) {
            super(color, filled);
            this.width = width;
            this.hight = hight;
        }

        public double getWidth() {
            return width;
        }

        public void setWidth(double width) {
            this.width = width;
        }

        public double getLength() {
            return hight;
        }

        public void setLength(double length) {
            this.hight = length;
        }

        public double getArea() {
            return width * this.hight;
        }

        public double getPerimeter() {
            return 2 * (width + this.hight);
        }

        @Override
        public void Resize(double percent) {
            this.width=width*(100+percent)/100;
            this.hight=hight*(100+percent)/100;
        }
        public String toString() {
            return "A Rectangle with width="
                    + getWidth()
                    + " and length= "
                    + getLength();
        }
    }
}
