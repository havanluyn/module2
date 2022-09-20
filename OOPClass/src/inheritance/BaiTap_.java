package inheritance;

public class BaiTap_ {
    public class Shape{
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
    public class Triangle extends Shape{
        private double side1;
        private double side2;
        private double side3;
        public Triangle(){
            this.side1=1.0;
            this.side2=1.0;
            this.side3=1.0;
        }

        public Triangle(String color, boolean filled, double side1, double side2, double side3) {
            super(color, filled);
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }

        public double getSide1() {
            return side1;
        }

        public void setSide1(double side1) {
            this.side1 = side1;
        }

        public double getSide2() {
            return side2;
        }

        public void setSide2(double side2) {
            this.side2 = side2;
        }

        public double getSide3() {
            return side3;
        }

        public void setSide3(double side3) {
            this.side3 = side3;
        }
        public double getArea(){
            double p=(side1+side2+side3)/2;
            return Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
        }
        public double getPerimeter(){
            return side1+side2+side3;
        }
        public String toString(){
            return "Tam giac co 3 canh "+side1+", "+side2+", "+side3+", "+"dien tich la "+getArea()+"chu vi la "+getPerimeter();
        }
    }
}
