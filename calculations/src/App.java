import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
    
        int absoluteValue = Math.abs(-5);
        int potentiation = (int) Math.pow(10,2);
        int squareValue = (int) Math.sqrt(100);
        double roundNumberUp = Math.ceil(10.53);
        double roundNumberDown = Math.floor(10.99);
        double lowerNumber = Math.min(10, 2);

        JOptionPane.showMessageDialog(null, lowerNumber);

        // int numberA = 82;
        // int numberB = 6;
        // numberB ++;
        // float result = (float) numberA / numberB;
        // int remainder = numberA % numberB; //mod

        // JOptionPane.showMessageDialog(null, result, "Math", JOptionPane.INFORMATION_MESSAGE);

        // System.out.println(remainder);

        // int secondResult = 2 * (5 + 3) * 4 - 8;

        // JOptionPane.showMessageDialog(null, secondResult);

    }
}
