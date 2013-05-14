/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ocos;
import java.util.*;
/**
 *
 * @author Jonathon Cronin
 */
public class Animula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dictionary d = new Hashtable();
        d.put("Life", "Exists");
        d.put("Domain", "Eukarya");
        d.put("Kingdom", "Animalia");
        d.put("Phylum", "Mollusca");
        d.put("Class", "Cephalopoda");
        d.put("Order", "Teuthida");
        d.put("Family", "Sepiina");
        d.put("Genus", "Sepiidae");
        d.put("Species", "Sepia apama");
        Ribosome test = new Ribosome(d);
        }
}
