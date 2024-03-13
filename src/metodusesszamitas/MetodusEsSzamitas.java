/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodusesszamitas;


public class MetodusEsSzamitas {
    
    
    public static void main(String[] args) {
        nehanySzamOsszegenekGyoke();
        
    }

    private static void nehanySzamOsszegenekGyoke() {
        int osszeg = osszegzes(2,osszegzes(3,4));
        double gyok = gyokvonas(osszeg);
        String kimenet = "%d gyök: %.4f\n".formatted(osszeg,gyok);
        System.out.println(kimenet);
        
        //int[] szamok = [3,5,12,2,3];
        //osszeg = osszegzes(szamok);
        osszeg = osszegzes(new int[]{3,5,12,2,3});
        gyok = gyokvonas(osszeg);
        kimenet = "%d gyök: %.4f\n".formatted(osszeg,gyok);
        kiiras(kimenet);
    }
    
    public static int osszegzes(int[] tomb) {
        int osszeg = 0;
        for (int i = 0; i < tomb.length; i++) {
            osszeg += tomb[i];
        }
        return osszeg;
    }
    
    public static int osszegzes(int a, int b) {
        //return a+b;
        
        //több soros megoldas:
        //int[] tomb = {a,b};
        //return oszegzes(tomb);
        
        //egy soros megoldas:
        return osszegzes(new int[]{a,b});
    }
    
    public static double gyokvonas(int osszeg) {
        return Math.sqrt(osszeg);
    }
    
    public static void kiiras(String uzenet) {
        System.out.print(uzenet);
    }
    
}
