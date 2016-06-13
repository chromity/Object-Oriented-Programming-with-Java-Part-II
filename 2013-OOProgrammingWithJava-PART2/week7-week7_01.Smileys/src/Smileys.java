
public class Smileys {

    public static void main(String[] args) {
      
        printWithSmileys("\\:D/");
        printWithSmileys("Methods");
        printWithSmileys("Beerbottle");
        printWithSmileys("Interface");
    }

    private static void printWithSmileys(String word) {
        
        if (word.length() % 2 != 0) {
            word = word + " ";
        }
        
        printTopAndBottom(word.length());
        printStringWithWall(word);
        printTopAndBottom(word.length());
        
    }
    
    private static void printTopAndBottom(int wordLength) {
        for (int i = 3 + wordLength / 2; i > 0; i--) { // word.length() divided by 2 because each smileys takes 2 charspace
                                                       // 3+ because of the smiley to align to the whitespaces in each side  
                                                       // of the word
            System.out.print(":)");
        }
        
        System.out.println("");

    }
    
    private static void printStringWithWall(String word) {
        System.out.print(":) ");
        System.out.print(word);
        System.out.println(" :)");
    }
}
