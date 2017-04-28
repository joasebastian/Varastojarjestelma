/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package varastojarjestelma;
import java.util.HashMap;
import  java.util.Map;

/**
 *
 *
 */
public class Tuote {
    
    private Map<String, Tuotetietue> tiedot = new HashMap();
    
    //konstruktorit
    public Tuote(String uusiTuotenumero, String uusiTuotenimi){
        Tuotetietue uusiTietue = new Tuotetietue(uusiTuotenimi);
        tiedot.put(uusiTuotenumero, uusiTietue);
    }
    public Tuote(){
        
    }
    
    //ei tarvi toistaseks
    public void setTiedot(String tuotenumero, Tuotetietue tietue){
        tiedot.put(tuotenumero, tietue);
    }
    
    //get perusavain (eli tuotenumero)
    public String getAvain(){
            for(Map.Entry<String, Tuotetietue> pari : tiedot.entrySet()){
                return pari.getKey();
            }
            return null;
    }
    
    
    
    
}
