import java.util.HashMap;
import java.util.ArrayList;

public class Dictionary {
    private HashMap<String, String> dict;
    
    public Dictionary() {
        dict = new HashMap<String, String>();
    }
    
    public String translate(String word) {
        return this.dict.get(word);
    }
    
    public void add(String word, String translation) {
        this.dict.put(word, translation);
    }
    
    public int amountOfWords() {
        return this.dict.size();
    }
    
    public ArrayList<String> translationList() {
        ArrayList<String> formattedList = new ArrayList<String>();
        
        for (String key : dict.keySet()) {
            formattedList.add(key + " = " + dict.get(key));
        }
        
        return formattedList;
    }
}
