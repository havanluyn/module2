package CleanCode;

public class Refactoring3 {
    public class Cylinder {
        public double getVolume(int radius, int height) {
            double baseArea = getBaseArea(radius);
            double perimeter = getPerimeter(radius);
            double volume = perimeter * height + 2 * baseArea;
            return volume;
        }

        private double getPerimeter(int radius) {
            return 2 * Math.PI * radius;
        }

        private double getBaseArea(int radius) {
            return Math.PI * radius * radius;
        }
    }
}
