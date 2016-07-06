public class Main {
    public static void main(String[] args) {
        PromissoryNote tuition = new PromissoryNote();
        
        tuition.setLoan("Mayo", 8000);
        tuition.setLoan("Daryl", 0);
        
        System.out.println(tuition.howMuchIsTheDebt("Daryl"));
    }
}
