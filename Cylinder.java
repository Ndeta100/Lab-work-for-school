public class Cylinder extends Circle{
    private double height;

    public Cylinder() {
        super();
        height = 1.0;
    }
    public Cylinder(double height) {
        super();
        this.height = height;
    }
    public Cylinder(double radius, double height) {
        super(radius);  // call superclass constructor Circle(r)
        this.height = height;
    }


    public double getHeight() {
        return height;
    }


    public double getVolume() {
        return getArea()*height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                "} " + super.toString();
    }

}

