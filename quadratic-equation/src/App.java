import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double delta, firstXValue, secondXValue, firstTerm, secondTerm, thirdTerm;
        Scanner reader = new Scanner(System.in);

        System.out.println("Insira o primeiro termo da equação: ");
        firstTerm = reader.nextDouble();
        while(firstTerm == 0){
            System.out.println("Valor inválido, insira o primeiro termo da equação: ");
            firstTerm = reader.nextDouble();
        }

        System.out.println("Insira o segundo termo da equação: ");
        secondTerm = reader.nextDouble();
        while(secondTerm == 0){
            System.out.println("Valor inválido, insira o segundo termo da equação: ");
            secondTerm = reader.nextDouble();
        }

        System.out.println("Insira o terceiro termo da equação: ");
        thirdTerm = reader.nextDouble();

        delta = Math.pow(secondTerm, 2) - (4 * firstTerm * thirdTerm);
        System.out.println(delta);

        firstXValue = ((secondTerm * - 1)  + Math.sqrt(delta)) / (2 * firstTerm);
        secondXValue = ((secondTerm * - 1)  -  Math.sqrt(delta)) / (2 * firstTerm);

        System.out.println("As raízes possíveis são: " + firstXValue + " e " + secondXValue);

        reader.close();
    }
}
