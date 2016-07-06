import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        Dictionary dict = new Dictionary();
        
        dict.add("Pineapple", "Pina");
        dict.add("Apple", "Mansanas");
        
        System.out.println(dict.translate("Pineapple"));
        System.out.println(dict.translate("Orange"));
        System.out.println(dict.amountOfWords());
        
        ArrayList<String> translations = dict.translationList();
        for(String translation: translations) {
            System.out.println(translation);
        }
        
    }
}
