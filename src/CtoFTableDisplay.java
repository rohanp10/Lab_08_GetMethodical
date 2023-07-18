import java.util.Scanner;

public class CtoFTableDisplay {
    public static void main(String[] args) {

        System.out.println("Celsius  Fahrenheit");

        for (double cTemp = -100; cTemp <= 100; cTemp++) {
            System.out.printf("%6.2f | %6.2f\n", cTemp, CtoF(cTemp));
        }
    }

    public static double CtoF(double Celsius) {

        double Fahrenheit = 0;

        Fahrenheit = Celsius * 9.0 / 5 + 32;

        return Fahrenheit;

    }
}
