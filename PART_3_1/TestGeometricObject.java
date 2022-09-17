package PART_3_1;

class TestGeometricObject
{
    public static void main(String[] args)
    {
        GeometricObject g = new Circle(3); // object is created for Circle
        GeometricObject g1 = new Rectangle(4,5); // object is created for Rectangle
        System.out.println("Area between two object are equal : " + CompareArea(g,g1));
        System.out.println("For Circle");
        System.out.println(g);
        System.out.println("Area of Circle: "+g.getArea());
        System.out.println("Perimeter of Circle: "+g.getPerimeter());
        System.out.println("For Rectangle");
        System.out.println(g1);
        System.out.println("Area of Rectangle: "+g1.getArea());
        System.out.println("Perimeter of Rectangle: "+g1.getPerimeter());
        System.out.println("This Program is made by 21CE138 Yuvrajsinh Solanki");
    }
    public static boolean CompareArea(GeometricObject obj1,GeometricObject obj2){ // This method is used to compare the Area.
        return obj1.getArea() == obj2.getArea();
    }
}
