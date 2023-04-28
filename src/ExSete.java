import java.util.Scanner;

public class ExSete {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String name;
        int n;


        System.out.println("Informe seu nome: ");
        name = teclado.nextLine();

        System.out.println("Informe um numero: ");
        n = teclado.nextInt();



        for (int i = 0; i < n; i++) {
            System.out.println(name);
        }


    }
}
