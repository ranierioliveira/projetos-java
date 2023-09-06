import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        // String movie = JOptionPane.showInputDialog(null, "Qual seu filme favortito", "title", JOptionPane.QUESTION_MESSAGE);

        String firstValue = JOptionPane.showInputDialog(null, "Digite um número: ");
        int firstValueNumber = Integer.parseInt(firstValue);

        String secondValue = JOptionPane.showInputDialog(null, "Digite outro número: ");
        int secondValueNumber = Integer.parseInt(secondValue);

        int result = firstValueNumber + secondValueNumber;

        JOptionPane.showMessageDialog(null, "A soma entre os numéros " + firstValueNumber + " e " + secondValueNumber +  " é " + result + "!", "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}
