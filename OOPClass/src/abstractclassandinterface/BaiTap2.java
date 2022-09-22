package abstractclassandinterface;

public class BaiTap2 {
    public static void main(String[] args) {
        BaiTap1.Shape[] shape = new BaiTap1.Shape[5];
        shape[0] = new BaiTap1.Circle(2);
        shape[1] = new Square(6);
        shape[2] = new BaiTap1.Rectangle(4, 5);
        shape[3] = new Square(4);
        shape[4] = new BaiTap1.Rectangle(3, 5);
        for (BaiTap1.Shape item : shape) {
            if (item instanceof Square) {
                System.out.println(item);
                System.out.println("Dien tich "+((Square) item).getArea());
                ((Square) item).howToColor();
                System.out.println();
            } else if (item instanceof BaiTap1.Circle) {
                System.out.println(item);
                System.out.println("Dien tich "+((BaiTap1.Circle) item).getArea());
                System.out.println();
            } else {
                System.out.println(item);
                System.out.println("Dien tich "+((BaiTap1.Rectangle) item).getArea());
                System.out.println();
            }
        }
    }

    public static class Square extends BaiTap1.Shape implements Colorable {
        private double width;

        public Square(String color, boolean filled, double width) {
            super(color, filled);
            this.width = width;
        }

        public Square(double width) {
            this.width = width;
        }

        public double getWidth() {
            return width;
        }

        public void setWidth(double width) {
            this.width = width;
        }

        public double getArea() {
            return this.width * width;
        }

        @Override
        public void howToColor() {
            System.out.println("Color all four sides");
        }

        @Override
        public String toString() {
            return "Square{" +
                    "width=" + width +
                    '}';
        }
    }
}
