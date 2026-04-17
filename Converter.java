public class Converter {
    double celsiusToFahrenheit(double c){
        return (c * 9 / 5) + 32;
    }

    double fahrenheitToCelsius(double f){
        return (f - 32) / 9 * 5;
    }

    double celsiusToKelvin(double c){
        return c + 273;
    }

    double kelvinToCelsius(double k){
        return  k - 273;
    }

    double kelvinToFahrenheit(double k){
        return ((k - 273) * 9 / 5) + 32;
    }

    double fahrenheitToKelvin(double f){
        return ((f - 32) / 9 * 5) + 273;
    }
}
