
public class OneItemBox extends Box {
    private boolean isFull;
    private String itemName;
    
    public OneItemBox(){
        this.isFull = false;
        this.itemName = "";
    }

    @Override
    public void add(Item item) {
        if (!this.isFull){
            this.itemName = item.getName();
            this.isFull = true;
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return this.itemName.equals(item.getName());
    }
}
