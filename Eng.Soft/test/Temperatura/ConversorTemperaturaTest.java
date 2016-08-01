/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperatura;

import org.junit.Test;
import static org.junit.Assert.*;


public class ConversorTemperaturaTest {
    
    double celsius = 29.7;
    double fahrenheit_esperado = 85.46;
    double fahrenheit = 85.46;
    double celsius_esperado = 29.7;
    
    ConversorTemperatura CT = new ConversorTemperatura();

    @Test
    public void testSomeMethod() {
        assertEquals(CT.converteCelsiusParaFahrenheit(celsius),fahrenheit_esperado);
       assertEquals(CT.converteFahrenheitParaCelsius(fahrenheit),celsius_esperado);
    }
    
}
