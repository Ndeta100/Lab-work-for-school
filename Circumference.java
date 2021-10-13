public class Circumference{
    private  double circumference;
    private double radius;

    public Circumference(double r, double circumference) {
       this.radius=radius;

        this.circumference = circumference;
    }
    public Circumference() {
    }
    public void setCircumference(double circumference) {
        this.circumference = circumference;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getCircumference() {
        return 2*radius*Math.PI;
    }
}
