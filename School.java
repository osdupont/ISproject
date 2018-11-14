/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package is.oli.pkg1.pkg0;

/**
 *
 * @author osdupont
 */
public class School {
    //instantievariabelen
    String naam;
    String adres;    //hoe afstnd tt de school bepalen?
    int aantalPlaatsen;

    
    // constructor met alle info
    public School(String naam, String adres, int aantalPlaatsen) {
        this.naam = naam;
        this.adres = adres;
        this.aantalPlaatsen = aantalPlaatsen;
    }

    
    // default constructor
    public School() {
        this.naam = null;
        this.adres = null;
        this.aantalPlaatsen = 0;   
        //oppassen bij tests voor geldige school (indien een school uit de lijst 
        //verwijderd zou worden)
    }
    
        
    //getters
    public String getNaam() {
        return naam;
    }

    public String getAdres() {
        return adres;
    }

    public int getAantalPlaatsen() {
        return aantalPlaatsen;
    }

    
    //setters
    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public void setAantalPlaatsen(int aantalPlaatsen) {
        this.aantalPlaatsen = aantalPlaatsen;
    }

    @Override
    public boolean equals(Object obj) {
        boolean gelijk = false;
        
        //meegegeven obj is niet 'null' en is een School-object
        if (obj != null && obj instanceof School) {
            //conversie naar School-object 'alfa'
            School alfa = (School) obj;
            
            //zijn alle instantievariabelen gelijk?
            if (alfa.aantalPlaatsen == this.aantalPlaatsen
                    && alfa.adres.equals(this.adres) 
                    && alfa.naam.equals(this.naam)){
                
                gelijk = true;
            }    
        }
        
        return gelijk;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
