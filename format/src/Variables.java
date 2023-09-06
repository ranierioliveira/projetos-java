public class Variables {
    public static void main(String[] args) throws Exception {
        String movie = "Openheimer"; //%s
        int releaseYear = 2023; //%d
        int runningTime = 180;
        float reviewNote = 8.8f; //%f
        char initialLetter = 'O'; //%c
        boolean isReleased = true; //%b

        System.out.println("Filme: " + movie);
        System.out.println("Ano de lançamento: " + releaseYear);
        System.out.println("Duração  " + runningTime);
        System.out.println("Nota segundo a crítica: " + reviewNote);
        System.out.println("Letra inicial:  " + initialLetter);
        System.out.println("Já foi lançado  " + isReleased);

        System.out.format("O filme %s lancado em %d tem uma duracao de %d minutos. \n", movie, releaseYear, runningTime);

        String name = "Ranieri ";
        String lastName = "Oliveira";
        String fullName = name + lastName;
        System.out.println(fullName);
    }
}
