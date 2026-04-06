package OOP_Java.Temperature;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.println("Enter the location: ");
        String location = sc.nextLine();
        System.out.println("Enter the temperature in Celsius: ");
        double celsius = sc.nextDouble();

        Temperature temperature = new Temperature(location, celsius);
        System.out.println(temperature);
        temperature.limitTemperature();

    }

}
