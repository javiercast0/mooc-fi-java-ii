
import java.util.ArrayList;


public class MisplacingBox extends Box {
    
    private ArrayList<Item> itemsInBox;
    
    public MisplacingBox(){
        this.itemsInBox = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        this.itemsInBox.add(item);
    }

    @Override
    public boolean isInBox(Item item) {
        return false;
    }
    
}
