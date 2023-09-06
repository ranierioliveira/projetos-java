import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite a quantidade de elementos: ");
    int n = sc.nextInt();
    double [] vect = new double[n]; 

    for(int i = 0; i < n; i++){
      System.out.println("Digite o valor: ");
      vect[i] = sc.nextDouble();
    }
    double sum = 0.0;
    for(int i = 0; i < n; i++){
      sum += vect[i];
    }
    double avg = sum / n;
    System.out.printf("Average height: %.2f\n", avg);
    sc.close();
  }
}