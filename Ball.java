public class Ball {
    private float x;
    private float y;
    private float z;

    // Constructor
    public Ball(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Getter for x
    public float getX() {
        return x;
    }

    // Getter for y
    public float getY() {
        return y;
    }

    // Getter for z
    public float getZ() {
        return z;
    }
    public void setX(float x){
        this.x = x;
    }
    public void setY(float y){
        this.y = y;
    }
    public void setZ(float z){
        this.z = z;
    }
    // Setter for x, y, z
    public void setXYZ(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // toString method
    @Override
    public String toString() {
        return "Ball at (" + x + ", " + y + ", " + z + ")";
    }
}
