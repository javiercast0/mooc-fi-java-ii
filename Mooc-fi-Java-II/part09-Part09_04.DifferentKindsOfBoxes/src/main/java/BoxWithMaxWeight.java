
import java.util.ArrayList;


public class BoxWithMaxWeight extends Box{
    private int capacity;
    private ArrayList<Item> itemsInBox;
    
    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.itemsInBox = new ArrayList<>();
    }
    

    @Override
    public void add(Item item) {  
        if(item.getWeight() <= this.capacity){
            this.itemsInBox.add(item);
            this.capacity = this.capacity - item.getWeight();
        }
    }
     
    @Override
    public boolean isInBox(Item item) {
        return this.itemsInBox.contains(item);
    }
}
