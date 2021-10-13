public class TestCylinder {
    public static void main(String[] args) {
        // Declare and allocate a new instance of cylinder
        //   with default color, radius, and height
        Cylinder c1 = new Cylinder();
        System.out.println("Cylinder:"
                + " radius=" + c1.getRadius()
                + " height=" + c1.getHeight()
                + " base area=" + c1.getArea()
                + " volume=" + c1.getVolume());

        // Declare and allocate a new instance of cylinder
        //   specifying height, with default color and radius
        Cylinder c2 = new Cylinder(45.0);
        System.out.println("Cylinder:"
                + " radius=" + c2.getRadius()
                + " height=" + c2.getHeight()
                + " base area=" + c2.getArea()
                + " volume=" + c2.getVolume());

        // Declare and allocate a new instance of cylinder
        //   specifying radius and height, with default color
        Cylinder c3 = new Cylinder(98.0, 090.0);
        System.out.println("Cylinder:"
                + " radius=" + c3.getRadius()
                + " height=" + c3.getHeight()
                + " base area=" + c3.getArea()
                + " volume=" + c3.getVolume());

        Person p1=new Person("Ndeta Innocent","katusepapi 13");
        p1.getAddress();
        p1.getName();
        System.out.println(p1);
        Student s1=new Student("Ndeta Innocent","katusepapi 13","software development",2021,5200);
        s1.getFee();
        s1.getProgram();
        System.out.println(s1);

        Staff st=new Staff("Ndeta Innocent","katusepapi 13","Mainor", 2200);


        st.getPay();
        System.out.println(st);

    }

}
