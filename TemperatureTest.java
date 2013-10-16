import static junit.framework.Assert.assertEquals;
import junit.framework.TestCase;

/**
 *
 * @author Mihai 260429151
 */
public class TemperatureTest extends TestCase {
    
    /**
     * Test of getValue method, of class Temperature.
     */
    public void testGetValue() {
       
        //This method tests for a the 0 value, a positive and a negative random value
        //The tests are performed with an accuracy of up to 3 decimal places
        
        //consturctors are defined here
        Temperature tempInKelvin0 = new Temperature(0, Temperature.Units.KELVIN);
        Temperature tempInKelvin1 = new Temperature(421.35, Temperature.Units.KELVIN);
        Temperature tempInFahrenheit0 = new Temperature(-65.8, Temperature.Units.FAHRENHEIT);
        Temperature tempInFahrenheit1 = new Temperature(0, Temperature.Units.FAHRENHEIT);
        Temperature tempInFahrenheit2 = new Temperature(125.62, Temperature.Units.FAHRENHEIT);
        Temperature tempInCelsius0 = new Temperature(-5.123, Temperature.Units.CELSIUS);
        Temperature tempInCelsius1 = new Temperature(0, Temperature.Units.CELSIUS);
        Temperature tempInCelsius2 = new Temperature(12, Temperature.Units.CELSIUS);
        
 
       //tests are defined here
       assertEquals(0.0, tempInKelvin0.getValue(), 0.0001);
       assertEquals(421.35, tempInKelvin1.getValue(), 0.0001);
       assertEquals(-65.8, tempInFahrenheit0.getValue(), 0.0001);
       assertEquals(0.0, tempInFahrenheit1.getValue(), 0.0001);
       assertEquals(125.62, tempInFahrenheit2.getValue(), 0.0001);
       assertEquals(-5.123, tempInCelsius0.getValue(), 0.0001);
       assertEquals(0.0, tempInCelsius1.getValue(), 0.0001);
       assertEquals(12, tempInCelsius2.getValue(), 0.0001);
       
       
        
    }

    /**
     * Test of getUnits method, of class Temperature.
     */
    public void testGetUnits() {
    
        //This method tests 2 values for yeach unit
        
        //constuctors
        Temperature tempInKelvin0 = new Temperature(0, Temperature.Units.KELVIN);
        Temperature tempInKelvin1 = new Temperature(243, Temperature.Units.KELVIN);
        Temperature tempInFahrenheit0 = new Temperature(-65.8, Temperature.Units.FAHRENHEIT);
        Temperature tempInFahrenheit1 = new Temperature(422.5, Temperature.Units.FAHRENHEIT);
        Temperature tempInCelsius0 = new Temperature(-5.123, Temperature.Units.CELSIUS);
        Temperature tempInCelsius1 = new Temperature(255.123, Temperature.Units.CELSIUS);
        
       
        //tests
        assertEquals(Temperature.Units.KELVIN, tempInKelvin0.getUnits());
        assertEquals(Temperature.Units.KELVIN, tempInKelvin1.getUnits());
        assertEquals(Temperature.Units.FAHRENHEIT, tempInFahrenheit0.getUnits());
        assertEquals(Temperature.Units.FAHRENHEIT, tempInFahrenheit1.getUnits());
        assertEquals(Temperature.Units.CELSIUS, tempInCelsius0.getUnits());
        assertEquals(Temperature.Units.CELSIUS, tempInCelsius1.getUnits());
        
        
    }

    /**
     * Test of changeUnits method, of class Temperature.
     */
    public void testChangeUnits() {
      //this method tests conversion from every possible units to evety possible unit.
        
        //costuctors for kelvin
        Temperature tempInKelvin0 = new Temperature(0, Temperature.Units.KELVIN);
        tempInKelvin0.changeUnits(Temperature.Units.KELVIN);
        Temperature tempInKelvin1 = new Temperature(0, Temperature.Units.KELVIN);
        tempInKelvin1.changeUnits(Temperature.Units.FAHRENHEIT);
        Temperature tempInKelvin2 = new Temperature(0, Temperature.Units.KELVIN);
        tempInKelvin2.changeUnits(Temperature.Units.CELSIUS);
        
        //constuctos for fahrenheit
        Temperature tempInFahrenheit0 = new Temperature(0, Temperature.Units.FAHRENHEIT);
        tempInFahrenheit0.changeUnits(Temperature.Units.KELVIN);
        Temperature tempInFahrenheit1 = new Temperature(0, Temperature.Units.FAHRENHEIT);
        tempInFahrenheit1.changeUnits(Temperature.Units.FAHRENHEIT);
        Temperature tempInFahrenheit2 = new Temperature(0, Temperature.Units.FAHRENHEIT);
        tempInFahrenheit2.changeUnits(Temperature.Units.CELSIUS);
        
        //constructors for celsisu
        Temperature tempInCelsius0 = new Temperature(0, Temperature.Units.CELSIUS);
        tempInCelsius0.changeUnits(Temperature.Units.KELVIN);
        Temperature tempInCelsius1 = new Temperature(0, Temperature.Units.CELSIUS);
        tempInCelsius1.changeUnits(Temperature.Units.FAHRENHEIT);
        Temperature tempInCelsius2 = new Temperature(0, Temperature.Units.CELSIUS);
        tempInCelsius2.changeUnits(Temperature.Units.CELSIUS);
        
        //tests
        assertEquals(Temperature.Units.KELVIN, tempInKelvin0.getUnits());
        assertEquals(Temperature.Units.FAHRENHEIT, tempInKelvin1.getUnits());
        assertEquals(Temperature.Units.CELSIUS, tempInKelvin2.getUnits());
        assertEquals(Temperature.Units.KELVIN, tempInFahrenheit0.getUnits());
        assertEquals(Temperature.Units.FAHRENHEIT, tempInFahrenheit1.getUnits());
        assertEquals(Temperature.Units.CELSIUS, tempInFahrenheit2.getUnits());
        assertEquals(Temperature.Units.KELVIN, tempInCelsius0.getUnits());
        assertEquals(Temperature.Units.FAHRENHEIT, tempInCelsius1.getUnits());
        assertEquals(Temperature.Units.CELSIUS, tempInCelsius2.getUnits());
        
        
    }

  
}
