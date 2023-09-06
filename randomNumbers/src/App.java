import java.util.Random;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        Random generator = new Random();

        String userInput = JOptionPane.showInputDialog(null, "Digite o nº de faces do dado: ", "Dado personalizado", JOptionPane.QUESTION_MESSAGE);

        int numberOfFaces = Integer.parseInt(userInput);

        int randomNumber = generator.nextInt(numberOfFaces) + 1;

        JOptionPane.showMessageDialog(null, "O número sorteado foi o " + randomNumber + " do dado de " + numberOfFaces + "!","Dado personalizado", JOptionPane.QUESTION_MESSAGE);

        // int diceNumbers = (int) (Math.random() * 6) + 1;
        // System.out.println(diceNumbers);
    }
}
