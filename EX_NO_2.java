package conversion;

public class Celsius {

    public double toFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public double toKelvin(double celsius) {
        return celsius + 273.15;
    }
}

package conversion;

public class Fahrenheit {

    public double toCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public double toKelvin(double fahrenheit) {
        return ((fahrenheit - 32) * 5 / 9) + 273.15;
    }
}

package conversion;

public class Kelvin {

    public double toCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public double toFahrenheit(double kelvin) {
        return ((kelvin - 273.15) * 9 / 5) + 32;
    }
}
import java.util.Scanner;
import conversion.Celsius;
import conversion.Fahrenheit;
import conversion.Kelvin;

public class EX_NO_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Celsius c = new Celsius();
        Fahrenheit f = new Fahrenheit();
        Kelvin k = new Kelvin();

        System.out.println("===== Temperature Converter =====");
        System.out.println("1. Celsius");
        System.out.println("2. Fahrenheit");
        System.out.println("3. Kelvin");

        System.out.print("Choose input temperature scale: ");
        int choice = sc.nextInt();

        System.out.print("Enter temperature value: ");
        double temp = sc.nextDouble();

        switch (choice) {

            case 1:
                System.out.println("Fahrenheit = " + c.toFahrenheit(temp));
                System.out.println("Kelvin = " + c.toKelvin(temp));
                break;

            case 2:
                System.out.println("Celsius = " + f.toCelsius(temp));
                System.out.println("Kelvin = " + f.toKelvin(temp));
                break;

            case 3:
                System.out.println("Celsius = " + k.toCelsius(temp));
                System.out.println("Fahrenheit = " + k.toFahrenheit(temp));
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}
