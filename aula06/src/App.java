import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    Scanner dados= new Scanner (System.in);
    System.out.println("Nome:");
    String Nome= dados.nextLine();

    System.out.println("Idade:");
    String Idade= dados.nextLine();

    System.out.println("Genero");
    String Genero= dados.nextLine();

    System.out.println(Nome);
    System.out.println(Idade);
    System.out.println(Genero);
    }
}
