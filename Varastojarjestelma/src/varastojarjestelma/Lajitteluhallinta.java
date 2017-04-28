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
public class Lajitteluhallinta {
    
    
    //TODO näit lisätää myöhemmin lisää sit ku jaksaa :)
    static Varastopaikka varastopaikka0 = new Varastopaikka("a-1");
    static Varastopaikka varastopaikka1 = new Varastopaikka("a-2");
    static Varastopaikka varastopaikka2 = new Varastopaikka("a-3");
    static Varastopaikka varastopaikka3 = new Varastopaikka("a-4");
    static Varastopaikka varastopaikka4 = new Varastopaikka("a-5");
    static Varastopaikka varastopaikka5 = new Varastopaikka("a-6");
    static Varastopaikka varastopaikka6 = new Varastopaikka("a-7");
    static Varastopaikka varastopaikka7 = new Varastopaikka("a-8");
    static Varastopaikka varastopaikka8 = new Varastopaikka("a-9");
    static Varastopaikka varastopaikka9 = new Varastopaikka("a-10");
    static Varastopaikka varastopaikka10 = new Varastopaikka("b-1");
    static Varastopaikka varastopaikka11 = new Varastopaikka("b-2");
    static Varastopaikka varastopaikka12 = new Varastopaikka("b-3");
    static Varastopaikka varastopaikka13 = new Varastopaikka("b-4");
    static Varastopaikka[] varastopaikat = {varastopaikka0, varastopaikka1, varastopaikka2, varastopaikka3, varastopaikka4, varastopaikka5, varastopaikka6, varastopaikka7, varastopaikka8, varastopaikka9, varastopaikka10, varastopaikka11, varastopaikka12, varastopaikka13};
    
    //palauttaa vapaat varastopaikat (kokonaan tyhjä, jokaisella kerroksella) merkkijonona 
    public String vapaatVarastopaikat(){
        String[] tyhjatPaikat = {null};
        for(Varastopaikka i : varastopaikat){
            if(i.onkoTyhja() == true){
                tyhjatPaikat = lisaaMerkkijonoon(tyhjatPaikat, i.getVarastopaikkatunnus());
            }
        }
        return merkkijonolistaMerkkijonoksi(tyhjatPaikat);
    }
    
    //lisää merkkijono merkkijonolistaan
    //pakko palauttaa String[] arvona koska en haluu tehdä staattista muuttujaa.
    private String[] lisaaMerkkijonoon(String[] merkkijonolista, String merkkijono){
        if(merkkijono != null && merkkijonolista != null){
            //listan luonnissa listan 1. kohtaan asetetaan null, ja se korvataan tässä uudella arvolla jos se vielä on olemassa
            if(merkkijonolista[0] == null){
                merkkijonolista[0] = merkkijono;
            }
            else{
                merkkijonolista = Arrays.copyOf(merkkijonolista, merkkijonolista.length+1);
                merkkijonolista[merkkijonolista.length-1] = merkkijono;
            }
        }
        else{
            //virheilmoitus
            System.out.println("lajitteluhallinta:lisaaMerkkijonoon ei tullu kaikkia parametreja!");
        }
        return merkkijonolista;
    }
    
    //yhdistä merkkijonolista yhdeksi merkkijonoksi
    private String merkkijonolistaMerkkijonoksi(String[] lista){
        String palautus = "";
        for(int i = 0 ; i<lista.length ; i++){
            //jos i on listan vika nii älä lisää pilkkua
            if(lista[i] == lista[lista.length-1]){
                palautus = palautus+lista[i];
            }
            else{
                palautus = palautus+lista[i]+" ,";
            }
        }
        return palautus;
    }
}
