
import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author qeiry
 */
public class ChangeHistory {
    private ArrayList<Double> history;
    
    public ChangeHistory(){
        this.history = new ArrayList<>();
    }
    
    public void add(double status) {
        this.history.add(status);
    }
    
    public void clear(){
        this.history.clear();
    }
    
    public String toString(){
        return this.history.toString();
    }
    
    public double maxValue(){
        if(this.history.isEmpty()){
            return 0;
        }
        return Collections.max(this.history);
    }
    
    public double minValue() {
        if(this.history.isEmpty()){
            return 0;
        }
        return Collections.min(this.history);
    }
    
    public double average(){
        if(this.history.isEmpty()){
            return 0;
        }
        double total = 0;
        for(double status : this.history) {
            total += status;
        }
        return total/this.history.size();
    }
}
