
import java.util.HashMap;


public class Abbreviations {
    private HashMap<String, String> abbreviations;
    
    public Abbreviations(){
        this.abbreviations = new HashMap<>();
    }
    
    public void addAbbreviation(String abbreviation, String explanation){
        this.abbreviations.put(abbreviation, explanation);
    }
    
    public boolean hasAbbreviation(String abbreviation){
        if(this.abbreviations.get(abbreviation) == null){
            return false;
        }
        return true;
    }
    
    public String findExplanationFor(String abbreviation){
        return this.abbreviations.get(abbreviation);
    }
}
