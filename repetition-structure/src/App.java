import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String answer;
        do{
            System.out.println("Are we there yet?");
            answer = sc.nextLine();
        } while (!answer.equals("yes"));
        System.out.println("We arrived!");
        sc.close();
    }
}
