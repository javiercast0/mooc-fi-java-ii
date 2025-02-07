
import java.util.ArrayList;
import java.util.HashMap;


public class VehicleRegistry {
    private HashMap<LicensePlate, String> owners;
    
    public VehicleRegistry(){
        this.owners = new HashMap<>();
    }
    
    public boolean add(LicensePlate licensePlate, String owner){
        if(this.owners.containsKey(licensePlate)){
            return false;
        }else{
            this.owners.put(licensePlate, owner);
            return true;
        }   
    }
    
    public String get(LicensePlate licensePlate){
        return this.owners.get(licensePlate);
    }
    
    public boolean remove(LicensePlate licensePlate){
        if(this.owners.containsKey(licensePlate)){
            this.owners.remove(licensePlate);
            return true;
        }else{
            return false;
        }
    }
    
    public void printLicensePlates(){
        for(LicensePlate key : this.owners.keySet()){
            System.out.println(key);
        }
    }
    
    public void printOwners(){
        ArrayList<String> allOwners = new ArrayList<>();
        
        for (LicensePlate key : this.owners.keySet()){
            String owner = this.owners.get(key);
            if(!allOwners.contains(owner)){
                System.out.println(owner); 
                allOwners.add(owner);
            }     
        }
    }
}