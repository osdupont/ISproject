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
public class ToewijzingsAanvraag {
    
    //instantievariabelen
    int ToewijzingsAanvraagNr;
    Ouder ouder;
    Student student;
    School[] voorkeuren; //3 scholen (lengte hier nog niet bepaald)
    Status status;
    
    
    //constructor met alle info  (zonder voorkeuren)
    public ToewijzingsAanvraag(int ToewijzingsAanvraagNr, Ouder ouder, Student student) {
        this.ToewijzingsAanvraagNr = ToewijzingsAanvraagNr;
        this.ouder = ouder;
        this.student = student;
        //geen voorkeuren meegegeven
        this.status = Status.InOntwerp;
    }
    
    
    
    //default constructor
    public ToewijzingsAanvraag() {
    }
    
    //getters
    public int getToewijzingsAanvraagNr() {
        return ToewijzingsAanvraagNr;
    }

    public Ouder getOuder() {
        return ouder;
    }

    public Student getStudent() {
        return student;
    }

    public School[] getVoorkeuren() {
        return voorkeuren;
    }
    
    public Status getStatus(){
        return status;
    }
    
    
    
    
    
    //setters
    public void setToewijzingsAanvraagNr(int ToewijzingsAanvraagNr) {
        this.ToewijzingsAanvraagNr = ToewijzingsAanvraagNr;
    }

    public void setOuder(Ouder ouder) {
        this.ouder = ouder;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setVoorkeuren(School[] voorkeuren) {
        this.voorkeuren = voorkeuren;
    }
    
    public void setStatus (Status status){
        this.status = status;
    }
    
    
    
    
    
    
    
    
    // test op invoer van 3 verschillende scholen
    public boolean gelijkeScholenInVoorkeuren(School[] voorkeuren){
        boolean verschillende = true;
        
        //test op 3 aanwezige scholen
        if (voorkeuren.length>3){
            System.out.println("meer dan 3 scholen opgegeven");
            return false;
        }
        if (voorkeuren.length<3){
            System.out.println("minder dan 3 scholen opgegeven");
            return false;
        }
        
        //test op gelijkheid van scholen? (gebruikt override equals van School)
        if (voorkeuren[0].equals(voorkeuren[1])){
            System.out.println("eerste 2 scholen zijn gelijk");
            return false;
        }
        if (voorkeuren[1].equals(voorkeuren[2])){
            System.out.println("scholen  2 & 3 zijn gelijk");
            return false;
        }
        if (voorkeuren[2].equals(voorkeuren[0])){
            System.out.println("scholen  1 & 3 zijn gelijk");
            return false;
        }
        
        
        return verschillende;
    }
    
    
   
    
    
    
    
    
    
    
    
}
