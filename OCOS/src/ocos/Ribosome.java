/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ocos;
import java.util.*;

public class Ribosome {
    //This class is designed to read DNA String Lists to insure the correct information is read.
    public Ribosome(){
        //Default constructor
    }
    
    public Ribosome(Dictionary dna){
        for (Enumeration e = dna.elements(); e.hasMoreElements();) {
         System.out.println(e.nextElement());
        }
    }
}
