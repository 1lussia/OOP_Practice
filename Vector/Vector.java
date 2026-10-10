public class Vector {
    private double x;
    private double y;
    private double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }
    
    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setZ(double z) {
        this.z = z;
    }
    
    public Vector SumVectors(Vector first, Vector second) {
        return new Vector(first.x + second.x, first.y + second.y, first.z + second.z);
    }

    public Vector SubVectors(Vector first, Vector second) {
        return new Vector(first.x - second.x, first.y - second.y, first.z - second.z);
    }

    public Vector Multiply(Vector first, double num) {
        return new Vector(first.x * num, first.y * num, first.z * num);
    }

    public double Multiply(Vector first, Vector second) {
        return first.x * second.x + first.y * second.y + first.z * second.z;
    }
}
