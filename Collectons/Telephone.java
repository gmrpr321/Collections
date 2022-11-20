import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Teledata {
    ArrayList<Double> array;

    Teledata() {
        this.array = new ArrayList<Double>();
    }

    void add(Double data) {
        array.add(Double.valueOf(data));
    }

    void min() {
        System.out.println("Minimum element is : " + Collections.min(array));
    }

    void max() {
        System.out.println("Maximum element is : " + Collections.max(array));
    }

    void average() {
        Double avg = 0.0d;
        for (int i = 0; i < array.size(); i++) {
            avg += array.get(i);
        }
        avg = avg / array.size();
        System.out.println("Average is : " + avg);
    }

}

public class Telephone {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        Teledata td = new Teledata();
        System.out.println("Enter data for 12 months");
        for (int i = 0; i < 12; i++) {
            td.add(scan.nextDouble());
        }
        td.min();
        td.max();
        td.average();
    }
}