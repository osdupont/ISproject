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
public class Systeem {

    Student[] studenten;
    
    
    
    public Systeem() {
        
        
        
        
    }
    
    public boolean gelijkeStudent(Student student) {
        boolean gelijk = false;
        for (int i = 0; i<studenten.length;i++){
            Student alfa = studenten[i];
            if (alfa.rijksRegisterNr.equals(student.rijksRegisterNr)){
                gelijk = true;
            }
        }
        
        return gelijk;
    }
    
    
    
    
    
    
    
    
}
