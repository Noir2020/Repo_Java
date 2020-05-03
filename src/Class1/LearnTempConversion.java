package Class1;

public class LearnTempConversion {

    public static void main(String[] args) {

        //1. °F = 9/5 (°C) + 32     (9/5) * cTemp + 32
        double cTemp = 22;
        double fTemp = (9/5.0) * cTemp + 32;
        System.out.println("Temperature in Fahrenheit is " + fTemp);

        //2. °F = 9/5 (K-273) + 32     (9/5) * (kTemp-273) + 32
        double kTemp = 310;
        double fTemperature = (9.0/5) * (kTemp-273) + 32;
        System.out.println("Temperature in Fahrenheit is " + fTemperature);

        //3. K = °C + 273    cTemperature + 273
        double cTemperature = 31;
        double kTemperature = cTemperature + 273;
        System.out.println("The temperature in Kelvin is " + kTemperature);

        //4. °C = K - 273    kelvinTemp - 273
        double kelvinTemp = 354;
        double celsiusTemp = kelvinTemp - 273;
        System.out.println("The temperature in Celsius is " + celsiusTemp);

        //5. K = 5/9 (°F - 32) + 273      (5/9) * (fahrenheitTemp - 32) + 273
        double fahrenheitTemp = 87;
        double kelvinTemperature = (5/9.0) * (fahrenheitTemp - 32) + 273;
        System.out.println("The temperature in Kelvin is " + kelvinTemperature);


    }
}


