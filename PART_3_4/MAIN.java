package PART_3_4;

import java.util.Scanner;

public class MAIN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of i :-");
        int i = sc.nextInt();
        Class_A a = new Class_A();
        Class_B b = new Class_B();
        a.Override(i);
        b.Override(i);
    }
}
