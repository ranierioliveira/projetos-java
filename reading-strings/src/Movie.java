import java.util.Scanner;

public class Movie {
    public static void main(String[] args) throws Exception {
        String favoriteMovie;

        //Criação um objeto leitor para ler valores digitados no teclado
        Scanner reader = new Scanner(System.in);
        //Configuração para delimitar o que é lido do teclado
        reader.useDelimiter("[\r\n]+");

        favoriteMovie = reader.next();

        System.out.println("Seu filme favorito é: " + favoriteMovie);

        reader.close();
    }
}
