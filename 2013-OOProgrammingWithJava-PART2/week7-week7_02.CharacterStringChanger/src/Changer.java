import java.util.ArrayList;

public class Changer {
    private ArrayList<Change> changes;
    private String modifiedString; // variable to store the string that will be 
                                   // change
    
    public Changer() {
        this.changes = new ArrayList<Change>();
        // creates an ArrayList to store the changes
    }
    
    public void addChange(Change change) {
        changes.add(change);
    }
    
    public String change(String characterString) {
        this.modifiedString = characterString;  // saves the characterString to a
                                                // object variable so that it will
                                                // not affect other instances
        
        for (Change change : changes) {
            this.modifiedString = change.change(this.modifiedString); // goes through each change object
                                                // in the ArrayList then calls the
                                                // object method change to modify
                                                // the string
        }
        
        return this.modifiedString;
    }
}
