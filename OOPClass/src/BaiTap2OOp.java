public class BaiTap2OOp {
    public static void main(String[] args) {
        Fan fan=new Fan(2,true,4,"red");
        System.out.println(fan.toString());
        Fan fan1=new Fan();
        System.out.println(fan1.toString());
        fan1.setColor("red");
        fan1.setOn(true);
        fan1.setSpeed(fan1.getMEDIUM());
        System.out.println(fan1.toString());
    }

    public static class Fan {
        private final int SLOW = 1, MEDIUM = 2, FAST = 3;
        private int speed = 1;
        private boolean on = false;
        private double radius = 5;
        private String color = "blue";

        public int getSLOW() {
            return SLOW;
        }

        public int getMEDIUM() {
            return MEDIUM;
        }

        public int getFAST() {
            return FAST;
        }

        public boolean isOn() {
            return on;
        }

        public double getRadius() {
            return radius;
        }

        public int getSpeed() {
            return speed;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public void setOn(boolean on) {
            this.on = on;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public void setSpeed(int speed) {
            this.speed = speed;
        }
        public Fan(){
            this.color = getColor();
            this.speed = getSpeed();
            this.radius = getRadius();
            this.on = isOn();
        }

        public Fan(int speed, boolean on, double radius, String color) {
            this.color = color;
            this.speed = speed;
            this.radius = radius;
            this.on = on;
        }

        public String toString() {
            String str= "";
            if (this.isOn()) {
                str += ("Fan is on\n");
                str += ("Speed: " + this.speed + "\n");
            } else {
                str += ("Fan is off"+"\n");
            }
            str += ("Color: " + this.color + "\n");
            str += ("Radius: " + this.radius + "\n");
            return str;
        }
    }
}
