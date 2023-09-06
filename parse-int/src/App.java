import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String ranking;
        String tier;
        int numberTier;
        Scanner reader = new Scanner(System.in);

        System.out.println("Qual o seu ranking? ");
        ranking = reader.nextLine();

        System.out.println("Qual seu tier?");
        tier = reader.nextLine();
        numberTier = Integer.parseInt(tier); 
        
        System.out.format("Seu ranking é %s e seu elo é %d!\n", ranking, numberTier);

        reader.close();
    }
}
