package ocos;
import java.util.*;


public class Life {
    List<String> dna = new ArrayList<>();
    private double vitality;
    
    public Life(){
        //Default constructor for Life 
        dna.add("failed life form");
        vitality = 0.1;// sets vitality to just before death so lifeform will fail after one turn.
    }
    
    public Life(List<String> dna){
        
    }
    
    public double death(){
        //This will determine the rate that the lifeform will decay into the environment
        //Each turn of the game this will take the lifeforms standing and determine the
        //rate of decay etc. that will be put into the environment for the next turn.
        return 1.0;
    }
}
