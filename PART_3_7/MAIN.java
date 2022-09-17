package PART_3_7;
import java.util.Scanner;
public class MAIN implements Cube {
    public void cube ( int a){
        System.out.println(a*a*a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to find Cube :");
        int a = sc.nextInt();
       MAIN c = new MAIN();
       c.cube(a);
       c.display();
        System.out.println("This Program is Created by 21CE138 Yuvrajsinh Solanki");
    }
}