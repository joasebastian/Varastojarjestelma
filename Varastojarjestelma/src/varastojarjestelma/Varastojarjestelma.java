/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package varastojarjestelma;




/**
 *
 *
 */
public class Varastojarjestelma {
    
    
    public static Tuote testiTuote = new Tuote("123-456", "appelsiinit");
    static Lajitteluhallinta lajittelu = new Lajitteluhallinta();
    
    //public static Paneeli paneeli = new Paneeli();
    
    
    public static void main(String[] args) {
        String testeri = testiTuote.getAvain();
        System.out.println(testeri);
        
        /*vitun grafiikat
        
        Grafiikka grafiikka = new Grafiikka();
        grafiikka.asetaNakyvyys();
        */
        System.out.println(lajittelu.vapaatVarastopaikat());
        
        
        
        
    }
}
