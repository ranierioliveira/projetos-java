import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
    double sum = 0.0;
    
    System.out.println("Digite a quantidade de produtos: ");
    int productsQuantity = sc.nextInt();
    sc.nextLine();
    
    Product [] vect = new Product[productsQuantity];

    for(int i = 0; i < productsQuantity; i++){
      System.out.println("Digite o nome do produto: ");
      String productName = sc.nextLine();

      System.out.println("Digite o preço do produto: ");
      double productPrice = sc.nextDouble();
      sc.nextLine();

      vect[i] = new Product(productName, productPrice);
    }

    for(int i = 0; i < productsQuantity; i++){
      sum += vect[i].getPrice();
    }

    double average = sum / productsQuantity;

    System.out.format("A média dos preços do produto é: %.2f ", average);
    }
}
/*class Product {
  public String name;
  public double price;

  Product(String name, double price){
    this.name = name;
    this.price = price;
  }

  double getPrice(){
    return price;
  }
  
} */