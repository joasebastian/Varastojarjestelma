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
    
    
    public static void main(String[] args) {
        String testeri = testiTuote.getAvain();
        System.out.println(testeri);
        
    }
    
}
