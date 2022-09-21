package inheritance;

public class BaiTap2 {
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

    public class Point3D extends Point2D {
        private float z;

        public Point3D() {
        }

        public Point3D(float x, float y, float z) {
            super(x, y);
            this.z = z;
        }

        public float getZ() {
            return z;
        }

        public void setZ(float z) {
            this.z = z;
        }

        public float[] getXYZ() {
            float[] xyz = {x, y, z};
            return xyz;
        }

        public void setXYZ(float x, float y, float z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

        @Override
        public String toString() {
            return "Point2D(" + x + ',' + y + ',' + z + ')';
        }
    }
}

