
import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Thing> things;
    private final int WEIGHT_LIMIT;

    public Suitcase(int maxWeight) {
        this.WEIGHT_LIMIT = maxWeight;
        this.things = new ArrayList<Thing>();
    }

    public void addThing(Thing thing) {
        if (thing.getWeight() + this.totalWeight() > this.WEIGHT_LIMIT) {
            return;
        }
        
        this.things.add(thing);
    }
    
    public void printThings() {
        System.out.println("Your suitcase contains the following things:");
        
        for (Thing thing : this.things) {
            System.out.println(thing);
        }
    }

    public int totalWeight() {
        int totalWeight = 0;
        
        for (Thing thing: this.things) {
            totalWeight += thing.getWeight();
        }
        
        return totalWeight;
    }
    
    public Thing heaviestThing() {
        if (this.things.isEmpty()) {
            return null;
        }
        
        int indexOfHeaviest = 0;
        
        for (Thing thing: this.things) {
            if (thing.getWeight() > things.get(indexOfHeaviest).getWeight()) {
                indexOfHeaviest = things.indexOf(thing);
            }
        }
        
        return this.things.get(indexOfHeaviest);
    }

    @Override
    public String toString() {
        if (this.things.isEmpty()) {
            return "empty (0 kg)";
        }
        
        String thingWord = "things";
        
        if (this.things.size() == 1) {
            thingWord = "thing";
        }
        return this.things.size() + " " + thingWord + " " + this.totalWeight() + " kg)";
    }

}
