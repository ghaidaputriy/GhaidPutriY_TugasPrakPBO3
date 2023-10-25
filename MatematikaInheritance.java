/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author User
 */
public class MatematikaInheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Matematika mtk = new Matematika();
        Matematika2 mtk2 = new Matematika2();
        
        mtk.pertambahan(20, 10);
        mtk.pengurangan(10, 5);
        mtk.pembagian(21, 2);
        mtk.perkalian(10, 3);
        mtk2.modulus(25, 2);
    }
    
}
