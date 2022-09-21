package inheritance;

public class BaiTap3 {
    public class Point2D {
        protected float x;
        protected float y;

        public Point2D() {
        }

        public Point2D(float x, float y) {
            this.x = x;
            this.y = y;
        }

        public float getX() {
            return x;
        }

        public void setX(float x) {
            this.x = x;
        }

        public float getY() {
            return y;
        }

        public void setY(float y) {
            this.y = y;
        }

        public float[] getXY() {
            float[] xy = {x, y};
            return xy;
        }

        public void setXY(float x, float y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "Point2D(" + x + ',' + y + ')';
        }
    }

    public class MovablePoint extends Point2D{
        private float xSpeed;
        private float ySpeed;

        public MovablePoint() {
        }

        public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
            super(x, y);
            this.xSpeed = xSpeed;
            this.ySpeed = ySpeed;
        }

        public MovablePoint(float xSpeed, float ySpeed) {
            this.xSpeed = xSpeed;
            this.ySpeed = ySpeed;
        }

        public float getxSpeed() {
            return xSpeed;
        }

        public void setxSpeed(float xSpeed) {
            this.xSpeed = xSpeed;
        }

        public float getySpeed() {
            return ySpeed;
        }

        public void setySpeed(float ySpeed) {
            this.ySpeed = ySpeed;
        }
        public float[] getXY() {
            float[] xy = {xSpeed, ySpeed};
            return xy;
        }

        public void setXY(float xSpeed, float ySpeed) {
            this.xSpeed = xSpeed;
            this.ySpeed = ySpeed;
        }
        public MovablePoint move(){
            x+=xSpeed;
            y+=ySpeed;
            return this;
        }

        @Override
        public String toString() {
            return "MovablePoint{ (" + x + ',' + y + ')' +
                    "xSpeed=" + xSpeed +
                    ", ySpeed=" + ySpeed +
                    '}';
        }
    }
}
