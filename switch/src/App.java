public class App {
    public static void main(String[] args) throws Exception {
        String character = "Joker";
        switch(character){
            case "Joker":
            System.out.println("Why so serious?");
            break;
            case "Mario":
            System.out.println("It's-a Me, Mario! ");
            break;
            case "Batman":
            System.out.println("I'm vengeance!");
            break;
            case "Goku":
            System.out.println("Hi, I am Goku");
            default:
            System.out.println("...");
        }
    }
}
