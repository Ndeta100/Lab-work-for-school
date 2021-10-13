public class Rectangle {
    private  float length;
    private  float width;
    private float height;

    public Rectangle(float length, float width, float height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Rectangle() {
    }

    public float getLength() {
        return length;
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public void setHeight(float height) {
        this.height = height;
    }
    public double getArea() {
        return width*height;
    }
    public double getPerimeter() {
        return 2*(width+height);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
