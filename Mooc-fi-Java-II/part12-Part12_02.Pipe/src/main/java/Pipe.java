
import java.util.ArrayList;

public class Pipe<T> {
    private ArrayList<T> pipe;
    
    public Pipe(){
        this.pipe = new ArrayList<>();
    }
    
    public void putIntoPipe(T value){
        this.pipe.add(value);
    }
    
    public T takeFromPipe(){
        if(this.pipe.isEmpty()){
            return null;
        }
        return this.pipe.remove(0);
    }
    
    public boolean isInPipe(){
        if(this.pipe.isEmpty()){
            return false;
        }
        return true;
    }
    
    
}
