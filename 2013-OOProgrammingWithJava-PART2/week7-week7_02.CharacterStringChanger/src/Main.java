public class Main {
    public static void main(String[] args) {
        String word = "mikkela";
        Change change1 = new Change('k', 'x');
        
        word = change1.change(word);
        
        System.out.println(word);
        
        
        Changer changeMaster = new Changer();
        changeMaster.addChange(new Change('k', 'x'));
        changeMaster.addChange(new Change('x', 'y'));
        
        System.out.println(changeMaster.change("Mikaela"));
    }
}
