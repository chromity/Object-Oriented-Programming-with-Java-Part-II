import java.util.Scanner;

public class TextUserInterface {
    private Dictionary dictionary;
    private Scanner reader;
    
    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.dictionary = dictionary;
        this.reader = reader;
    }
    
    public void start() {
        System.out.println("Statements:");
        System.out.println("add - adds a word pair to the dictionary");
        System.out.println("translate - asks a word and prints its translation");
        System.out.println("quit - quits the text user interface");
        
        while (true) {
            System.out.print("Statement: ");  
            String choice = reader.nextLine();
            
            if (choice.equals("quit")) {
                break;
            }
            
            handleStatement(choice);
        }
        
        System.out.println("Cheers!");
    }
    
    public void handleStatement(String choice) {
        if (choice.equals("add")) {
            add();
        } else if (choice.equals("translate")) {
            translate();
        } else {
            System.out.println("Unknown statement.");
        }
    }
        
    public void add(){
        System.out.print("In Filipino: ");
        String wordInFilipino = reader.nextLine();
        System.out.println("Translation: ");
        String wordInEnglish = reader.nextLine();
                
        this.dictionary.add(wordInFilipino, wordInEnglish);
    }
    
    public void translate() {
        System.out.print("Give a word: ");
        String word = reader.nextLine();
        
        if (this.dictionary.translate(word) == null) {
            System.out.println("Unknown word!");
        } else {
            System.out.println("translation: " + this.dictionary.translate(word));
        }
    }
}
