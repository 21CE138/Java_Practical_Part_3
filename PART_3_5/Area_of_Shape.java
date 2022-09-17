package PART_3_5;
import PART_3_1.Circle; // import of Circle class from different Package
import java.util.Scanner;
public class Area_of_Shape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius : ");
        int radius = sc.nextInt(); // Taking input for Radius from user.
        Circle a = new Circle(radius); // creating object of java Class.
        System.out.println("Area of Circle is : ");
        System.out.println(a.getArea()); // Calling of method of Circle class.
        System.out.println("Perimeter of Circle is : ");
        System.out.println(a.getPerimeter()); // Calling of method of Circle class.
        System.out.println("This Program is Created by 21CE138 Yuvrajsinh Solanki");
    }

}
