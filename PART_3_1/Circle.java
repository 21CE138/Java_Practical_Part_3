package PART_3_1;
import java.util.*;
   public class Circle extends GeometricObject  // Circle class Extends Geometric Object.
 {
    private double radius;
     public Circle() // Constructor
     {}
     public Circle(double radius)
     {
      this.radius =radius;
     }
  public double getRadius() {
   return radius;
  }
  public void setRadius(double radius) {
   this.radius = radius;
  }
  public double getDiameter()
  {
   return radius*2;
  }
  public double getArea() {   // Method is made to calculate area of circle
   return 3.14*radius*radius;
  }
  public double getPerimeter(){ // Method is made to calculate Perimeter of circle
   return 2*3.14*radius;
  }
  public String toString() {
   return "Circle Created on: "+ getDateCreated() + "\nRadius of Circle: "+radius ;
  }
  }
