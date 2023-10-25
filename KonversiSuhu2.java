/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class KonversiSuhu2 extends KonversiSuhu{
    double fahrenheitToReamur(double fahrenheit){
        rumus = 0.4444444444444444 * (fahrenheit - 32);
        System.out.println("Fahrenheit to Reamur : " + rumus + "R");
        return rumus;
    }
}
