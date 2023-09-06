import java.util.ArrayList;
import java.util.List;

class Main {
  public static void main(String[] args) {
    List <String> list = new ArrayList<>();
    list.add("Maria");
    list.add("Joana");
    list.add(0, "Raníeri");
    System.out.println("Number of members: " + list.size());

    for(String x : list){
      System.out.println(x);
    }

    System.out.println("-------------------------");
    list.removeIf(x -> x.charAt(0) == 'M');

    for (String x : list){
      System.out.println(x);
    }

    System.out.println(list.indexOf("Joana"));

    
  }
}