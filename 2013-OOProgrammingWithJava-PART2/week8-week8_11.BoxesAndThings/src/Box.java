import java.util.ArrayList;

public class Box implements ToBeStored {
    private double maxWeight;
    private ArrayList<ToBeStored> items;
    
    public Box (double maxWeight){
        this.items = new ArrayList<ToBeStored>();
        this.maxWeight = maxWeight;
    }
   
    @Override
    public double weight(){
        double weight = 0;
        
        for (ToBeStored obj : this.items){
            weight += obj.weight();
        }
        
        return weight;       
    }
    
    public void add(ToBeStored obj){

        if (this.weight() + obj.weight() > this.maxWeight) {
            return;
        }
        
        items.add(obj);
    }
    
    @Override
    public String toString(){
        return "Box: " + this.items.size() + " things, total weight " + this.weight() + " kg";
    }
}
