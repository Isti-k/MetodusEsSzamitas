/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodusesszamitas;

import static metodusesszamitas.MetodusEsSzamitas.osszegzes;

/**
 *
 * @author KovácsIstvánGábor(SZ
 */
public class TombokMegjelenitese {
    
    
    public static void main(String[] args) {
        negyzetbeIras();
        egysorbaIras();
        
    }

    private static void negyzetbeIras() {
        char[] betuk = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        System.out.println("tömb elemei több sorban:");
        for (int i = 0; i < betuk.length; i++) {
            if(i != 0 && i % 3 == 0){
                System.out.println("");
            }
            System.out.print(betuk[i] + " ");
        }
        System.out.println("");
    }
    

    private static void egysorbaIras() {
        char[] betuk = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        System.out.println("tömb elemei 1 sorban:");
        for (int i = 0; i < betuk.length; i++) {
            System.out.print(betuk[i] + " ");
        }
        System.out.println("");
    }
}
