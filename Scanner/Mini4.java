class Scanner
public class Main {
    public static void main(String[] args) {
        double celsius = 25;
        double fahrenheit = TemperatureConverter.celsiusToFahrenheit(celsius);
        System.out.println(celsius + " degrees Celsius is equal to " + fahrenheit + " degrees Fahrenheit.");

        double fahrenheit2 = 77;
        double celsius2 = TemperatureConverter.fahrenheitToCelsius(fahrenheit2);
        System.out.println(fahrenheit2 + " degrees Fahrenheit is equal to " + celsius2 + " degrees Celsius.");
    }
}
