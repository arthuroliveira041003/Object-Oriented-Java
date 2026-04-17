public class TestConverter {
    void runAllTests(){

      Converter c = new Converter();
      double celsius = 10;
      double fahrenheit = 50;
      double kelvin = 283;
  
      //Using the same temperature in different units to verify all methods!

      System.out.println("Starting tests...");

      if(c.celsiusToFahrenheit(celsius) != fahrenheit){
        System.out.println("celsiusToFahrenheit test failed");
      }

      if(c.celsiusToKelvin(celsius) != kelvin){
        System.out.println("celsiusToKelvin test failed");
      }

      if(c.fahrenheitToCelsius(fahrenheit) != celsius){
        System.out.println("fahrenheitToCelsius test failed");
      }

      if(c.fahrenheitToKelvin(fahrenheit) != kelvin){
        System.out.println("fahrenheitToKelvin test failed");
      }

      if(c.kelvinToCelsius(kelvin) != celsius){
        System.out.println("kelvinToCelsius test failed");
      }

      if(c.kelvinToFahrenheit(kelvin) != fahrenheit){
        System.out.println("kelvinToFahrenheit test failed");
      }

      System.out.println("All tests completed!");
    }

    public static void main(String[] args) {
        new TestConverter().runAllTests();
    }
}
