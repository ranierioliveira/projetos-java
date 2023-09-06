import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int count = 0;

    System.out.println("Digite um número inteiro para ser a diagonal principal: ");
    int n = sc.nextInt();
    int [][] mat = new int[n][n];

    System.out.println("Digite os valores da matriz: ");
    for(int i = 0; i < mat.length; i++){
      for(int j = 0; j < mat[i].length; j++){
        mat[i][j] = sc.nextInt();
      }
    }

    for(int i = 0; i < mat.length; i++){
      for(int j = 0; j < mat[i].length; j++){
         System.out.print(mat[i][j] + " ");
      }
        System.out.println(" ");
    }

    System.out.println("Diagonal principal: ");
    for(int i = 0; i < mat.length; i++){
      System.out.println(mat[i][i] + " ");
    }

    for(int i = 0; i < mat.length; i++){
      for(int j = 0; j < mat[i].length; j++){
        if(mat[i][j] < 0){
          count++;
        }
      }
    }

    System.out.println("Número de negativos: " + count);
    
    sc.close();
  }
}