/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package varastojarjestelma;
import java.util.Arrays;
/**
 *
 *
 */
public class Varastopaikka {
    private String paikkatunnus;
    private Tuote[] tuotekerros1 = new Tuote[0];
    private Tuote[] tuotekerros2 = new Tuote[0];
    private Tuote[] tuotekerros3 = new Tuote[0];
    
    //konstruktorit:
    //parametreilla
    public Varastopaikka(String uusiPaikkatunnus){
        paikkatunnus = uusiPaikkatunnus;
    }
    //ilman parametreja
    public Varastopaikka(){
    }
    
    //getterit
    public String getVarastopaikkatunnus(){
        return paikkatunnus;
    }
    public String getVarastopaikkasisältö(){
        //TODO
        return null;
    }
    
    //setterit
    //poista tää ellei tarvi
    public void setVarastopaikkatunnus(String uusiTunnus){
        paikkatunnus = uusiTunnus;
    }
    
    //onko paikka kokonaan tyhjä?
    public boolean onkoTyhja(){
        int i = tuotekerros1.length;
        if(tuotekerros1.length == 0 && tuotekerros2.length == 0 && tuotekerros3.length == 0){
            return true;
        }
        return false;
    }
    
}
