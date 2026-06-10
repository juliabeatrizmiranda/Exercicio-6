import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1 - E-mail");
        System.out.println("2 - SMS");
        System.out.println("3 - WhatsApp");

        int opcao = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite a mensagem: ");
        String mensagem = sc.nextLine();

        System.out.println("Opção: " + opcao);
        System.out.println("Mensagem: " + mensagem);

        sc.close();
    }
}