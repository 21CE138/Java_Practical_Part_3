package PART_3_2;
import java.util.Vector;
public class MAIN {
    public static void main(String[] args) {
        StudentDetail[] s= new StudentDetail[5];
        s[0] = new StudentDetail();
        s[1] = new StudentDetail();
        s[2] = new StudentDetail();
        s[3] = new StudentDetail();
        s[4] = new StudentDetail();
        Vector<StudentDetail> obj1 = new Vector<>();
        obj1.add(s[0]);
        obj1.add(s[1]);
        obj1.add(s[2]);
        obj1.add(s[3]);
        obj1.add(s[4]);
        for (int i = 0; i < 5; i++) {
            s[i].getName();
            s[i].getRollNo();
        }
        for (int i = 0; i < 5; i++) {
            s[i].displayName();
            s[i].displayRollNo();
        }
        System.out.println("This Program is Created by 21CE138 Yuvrajsinh Solanki");
    }
}
