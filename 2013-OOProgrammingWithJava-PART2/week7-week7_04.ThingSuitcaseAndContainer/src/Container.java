import java.util.ArrayList;

public class Container {
    private final int MAXIMUM_WEIGHT;
    private ArrayList<Suitcase> container;
    
    public Container(int maxWeight) {
        this.MAXIMUM_WEIGHT = maxWeight;
        this.container = new ArrayList<Suitcase>();
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if (suitcase.totalWeight() + this.getTotalWeight() > this.MAXIMUM_WEIGHT) {
            return;
        }
        
        container.add(suitcase);
    }
    
    public int getTotalWeight() {
        int totalWeight = 0;
        
        for (Suitcase suitcase: this.container) {
            totalWeight += suitcase.totalWeight();
        }
        
        return totalWeight;
    }
    
    public void printThings() {
        System.out.println("There are the following things in the container"
                + "suitcases:");
        
        for (Suitcase suitcase : this.container) {
            suitcase.printThings();
        }
    }
    
    @Override
    public String toString() {
        return this.container.size() + " suitcases (" + this.getTotalWeight() + " kg)";
    }
}
