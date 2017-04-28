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
public class Tuotetietue {
    private String tuotenimi;
    
    //konstruktorit
    public Tuotetietue(String uusiTuotenimi){
        this.tuotenimi = uusiTuotenimi;
    }
    public Tuotetietue(){
        
    }
    
    //getteri
    public String getTuotenimi(){
        return tuotenimi;
    }
    
    //setteri
    public void setTuotenimi(String uusiNimi){
        this.tuotenimi = uusiNimi;
    }
}
