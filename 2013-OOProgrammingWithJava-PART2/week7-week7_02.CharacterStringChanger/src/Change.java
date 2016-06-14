
public class Change {
    private final char FROMCHARACTER;
    private final char TOCHARACTER;
    
    public Change(char fromCharacter, char toCharacter) {
        this.FROMCHARACTER = fromCharacter;
        this.TOCHARACTER =  toCharacter;
    }
    
    public String change(String characterString) {
        return characterString.replace(FROMCHARACTER, TOCHARACTER);
    }
    
}
