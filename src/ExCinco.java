import java.util.Scanner;

public class ExCinco {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int vetor[] = new int[20];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Informe um numero");
            vetor[i] = teclado.nextInt();


        }
        System.out.println("Os numeros entre 0 e 100 são: ");
        for (int i = 0; i < vetor.length; i++) {

            if (vetor[i] >= 0 && vetor[i]<=100) {
                System.out.println(vetor[i]);

            }
        }
    }
}
