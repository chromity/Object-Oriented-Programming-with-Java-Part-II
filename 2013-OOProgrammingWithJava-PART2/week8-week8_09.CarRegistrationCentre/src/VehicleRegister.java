import java.util.HashMap;

public class VehicleRegister {
    private HashMap<RegistrationPlate, String> owner;
    
    public VehicleRegister() {
        this.owner = new HashMap<RegistrationPlate, String>();
    }
    
    public boolean add(RegistrationPlate plate, String owner){
        if (this.owner.get(plate) == null) {
            this.owner.put(plate, owner);
            return true;
        }
        
        return false;
    }
    
    public String get(RegistrationPlate plate){
        return this.owner.get(plate);
    }
    
    public boolean delete(RegistrationPlate plate){
        if (this.owner.get(plate) != null) {
            this.owner.remove(plate);
            return true;
        }
       
        return false;
    }
    
    public void printRegistrationPlates() {
        for (RegistrationPlate plate: this.owner.keySet()){
            System.out.println(plate);
        }
    }
    
    public void printOwners() {
        String owners = "";
        for (RegistrationPlate plate: this.owner.keySet()){
            if(!owners.contains(this.owner.get(plate))) {
                owners += this.owner.get(plate) + "\n";
            }
        }
        
        System.out.println(owners);
    } 
  
}
