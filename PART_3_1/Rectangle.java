package PART_3_1;

  class Rectangle extends GeometricObject{
    private double width;
    private double height;
    public Rectangle() {
    }
    public Rectangle(double width,double height) {
        this.width = width;
        this.height = height;
    }
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
     public double getArea() {
         return width*height;
     }
     public double getPerimeter()
     {
         return 2*(height+width);
     }
     public String toString() {
         return  "Rectangle Created on: "+ getDateCreated() + "\nWidth of Rectangle: "+ width + "\nHeight of rectangle: " + height;
     }
}
