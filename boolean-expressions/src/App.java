import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        int watchedEpisodes = 927;
        int totalEpisodes = 927;
        boolean watchedSerie = watchedEpisodes == totalEpisodes;
        JOptionPane.showMessageDialog(null, watchedSerie);
    }
}
