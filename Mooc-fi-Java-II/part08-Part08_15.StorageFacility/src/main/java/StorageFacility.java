
import java.util.ArrayList;
import java.util.HashMap;


public class StorageFacility {
    private HashMap<String, ArrayList<String>> storages;
    
    public StorageFacility() {
        this.storages = new HashMap<>();
    }
    
    public void add(String unit, String item) {
        this.storages.putIfAbsent(unit, new ArrayList<>());
        ArrayList<String> storage =  this.storages.get(unit);
        storage.add(item);
    }
    
    public ArrayList<String> contents(String storageUnit){
        return this.storages.getOrDefault(storageUnit, new ArrayList<>());
    }
    
    public void remove(String storageUnit, String item){
        ArrayList<String> storage =  this.storages.get(storageUnit);
        storage.remove(item);
        if (storage.isEmpty()) {
            this.storages.remove(storageUnit);
        }
    }
    
    public ArrayList<String> storageUnits() { // returns the names of the storage units as a list. NB! Only the units that contain items are listed.
        ArrayList<String> unitNames = new ArrayList<>();
        for(String key : this.storages.keySet()) {
            if(!this.storages.get(key).isEmpty()) {
                unitNames.add(key);
            }
        }
        return unitNames;
    }
}