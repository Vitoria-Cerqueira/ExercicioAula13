import java.sql.SQLOutput;
import java.util.Scanner;

public class ExDois {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num;

        System.out.println("Informe um  numero: ");
        num = teclado.nextInt();

        if (num % 2 == 0) {
            System.out.println("O resultado da operação é " + (num + 5));
        }
        else {
            System.out.println("O resultado da operação é " + (num + 8));
        }
    }
}
