/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class KonversiSuhu {
    double rumus;
    
    double celciusToFahrenheit(double celcius){
        rumus = (1.8 * celcius) + 32;
        System.out.println("Celcius to Fahrenheit : " + rumus + "F");
        return rumus;
    }
    
    double celciusToReamur(double celcius){
        rumus = 0.8 * celcius;
        System.out.println("Celcius to Reamur = " + rumus + "R");
        return rumus;
    }
}
