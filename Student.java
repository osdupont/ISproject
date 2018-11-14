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
public class Student {
    
    //instantievariabelen
    String rijksRegisterNr;
    String naam;
    String voornaam;
    String gsmNr;
    String adres;
    String email;
    
    
    
    
    // constructor met alle info

    public Student(String rijksRegisterNr, String naam, String voornaam, String gsmNr, String adres, String email) {
        this.rijksRegisterNr = rijksRegisterNr;
        this.naam = naam;
        this.voornaam = voornaam;
        this.gsmNr = gsmNr;
        this.adres = adres;
        this.email = email;
    }
    

    

    
    // lege constructor (default)
    public Student() {
        
    }
    // nog constructor nodig met partiele info? (e.g. 6 andere constrts)?!   
    
    // getter methodes;
    public String getRijksRegisterNr() {
        return rijksRegisterNr;
    }

    public String getNaam() {
        return naam;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public String getGsmNr() {
        return gsmNr;
    }
    
    public String getAdres() {
        return adres;
    }

    public String getEmail() {
        return email;
    }

    
    
    
    // setter methodes
    public void setRijksRegisterNr(String rijksRegisterNr) {
        this.rijksRegisterNr = rijksRegisterNr;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public void setGsmNr(String gsmNr) {
        this.gsmNr = gsmNr;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
    
    
}
