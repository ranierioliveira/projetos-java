import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int firstInput;
        int secondInput;
        Scanner reader = new Scanner(System.in);

        System.out.println("Digite o valor do dividendo: ");
        firstInput = reader.nextInt();

        System.out.println("Digite o valor do divisor: ");
        secondInput = reader.nextInt();

        float result = (float) firstInput / secondInput;
        System.out.format("O resultado da divisão entre %d e %d é %.2f\n", firstInput, secondInput, result);

        reader.close();
    }
}
