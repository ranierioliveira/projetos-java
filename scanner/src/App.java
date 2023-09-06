import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int number;
        //Scanner -> classe
        Scanner reader = new Scanner(System.in);
        number = reader.nextInt();
        System.out.println("Número é " + number);

        reader.close();
    }
}
