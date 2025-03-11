
import java.util.ArrayList;
import java.util.List;


public class Herd implements Movable {
    private List<Movable> herds;
    
    public Herd (){
        this.herds = new ArrayList<>();
    }
    
    public void addToHerd(Movable movable) {
        this.herds.add(movable);
    }
    
    public void move(int dx, int dy) {
        for (Movable member : this.herds) {
            member.move(dx, dy);
        }
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        
        for(Movable member : this.herds){
            sb.append(member.toString()).append("\n");
        }
        
        return sb.toString().trim();
        
    }
    
    
}
