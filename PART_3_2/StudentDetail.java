package PART_3_2;
import java.util.*;
class StudentDetail implements IPrinter,IScanner{
    int Roll_No;
    String Name;
    Scanner sc = new Scanner(System.in);
    public void getRollNo() {
        System.out.println("Enter Your Roll No : ");
        Roll_No = sc.nextInt();
    }
    public void getName() {
        System.out.println("Enter Your Name : ");
        Name = sc.nextLine();
    }
    public void displayRollNo() {
        System.out.println("Roll No : " + Roll_No);
    }
    public void displayName() {
        System.out.println("Name : " + Name);
    }
}
