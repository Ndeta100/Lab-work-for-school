public class TestCircle {
    public static void main(String[] args) {

        Circle c1=new Circle();
        System.out.println("The circle has radius of "
                + c1.getRadius() + " and area of " + c1.getArea());

        Circle c2= new Circle(6.2,"red");
        System.out.println("The circle has radius of "
                + c2.getRadius() + " and area of " + c2.getArea() + "and a color of " + c2.getColor());
//        System.out.println(c1.radius); These variables can't be accessed directly or set because they are encapsulated ie they are protected from the outside world

        Circle c3 = new Circle();
        c3.setRadius(2.5);
        c3.setColor("cyan");
        System.out.println("radius is: " + c3.getRadius());
        System.out.println("color is: " + c3.getColor());

        Circle c4 = new Circle(1.9,"blue");
        System.out.println(c4.toString());
        System.out.println(c4);
        System.out.println("Operator '+' invokes toString() too: " + c4);

    }
    }
