import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class StudentData {
    String name;
    int rollno;
    double cgpa;

    StudentData(String name, int rollno, double cgpa) {
        this.name = name;
        this.rollno = rollno;
        this.cgpa = cgpa;
    }

    public String toString() {
        return "Name : " + this.name + "\nRollno :" + rollno + "\nCGPA : " + cgpa;
    }
}

class sortStudents implements Comparator<StudentData> {
    public int compare(StudentData a, StudentData b) {
        return a.name.compareTo(b.name);
    }
}

public class Stu {
    public static void main(String args[]) {
        String[] names = { "qwert", "yuiop", "asdfg", "hjkl", "zxcv", "vbnm", "qazw", "sdsc", "jlhd", "sasdf",
                "asdf", "dfdfher", "sdgjhdg", "noih", "ouboh", "wtsadf", "asfaasdf", "mxcgoirej", "qweqw", "sadfe" };
        int[] rollnos = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        double[] cgpas = { 9.53, 9.34, 4.53, 2.53, 6.74, 7.45, 8.56, 5.74, 5.86, 8.65, 6.67, 7.56, 8.67, 6.56, 6.35,
                6.42, 7.74, 8.34, 7.43, 8.33 };
        ArrayList<StudentData> data = new ArrayList<StudentData>();
        Scanner scan = new Scanner(System.in);
        int rollno;
        String name;
        double cgpa;
        for (int i = 0; i < 20; i++) {
            data.add(new StudentData(names[i], rollnos[i], cgpas[i]));
        }
        Collections.sort(data, new sortStudents());
        System.out.println("Student data entries sorted by names ");
        for (int i = 0; i < 20; i++) {
            StudentData d = data.get(i);
            System.out.println(d);
        }
    }
}
