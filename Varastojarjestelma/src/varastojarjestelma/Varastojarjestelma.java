/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package varastojarjestelma;
import java.util.Scanner;




/**
 *
 *
 */
public class Varastojarjestelma {
    
    
    public static Tuote testiTuote = new Tuote("123-456", "appelsiinit");
    static Lajitteluhallinta lajittelu = new Lajitteluhallinta();
    static Scanner lukija = new Scanner(System.in);
    
    //public static Paneeli paneeli = new Paneeli();
    
    
    public static void main(String[] args) {
        int valinta = 0;
        String testeri = testiTuote.getAvain();
        System.out.println(testeri);
        
        /*vitun grafiikat
        
        Grafiikka grafiikka = new Grafiikka();
        grafiikka.asetaNakyvyys();
        */
        do{
            System.out.println("vaihtoehdot... mikä on valintasi?...");
        }while(valinta!=0);
        
        
        System.out.println(lajittelu.vapaatVarastopaikat());
        
        
        
        
    }
    
    
}