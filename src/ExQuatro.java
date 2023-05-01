import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExQuatro {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int qtaIdades;
        int idade;
        double media=0;
        List<Integer> idades = new ArrayList<>();

        System.out.println("Digite a quantidade de idade que voce quer adicionar: ");
        qtaIdades = teclado.nextInt();



        for (int i = 0; i < qtaIdades; i++) {
            System.out.println("Informe sua idade: ");
            idade = teclado.nextInt();
            idades.add(idade);
        }

        System.out.println("IDADES " + idades);

        int total =0;
        for (int i = 0; i < idades.size(); i++) {
            total += idades.get(i);
        }
        System.out.println("Total da soma das idade: " + total);

        System.out.println("------------------------------------------");

        media = (double) total / idades.size(); // cast-up elevar o tipo de dado usado, nesse caso foi usado o int e elevou pra double
        System.out.println("A media das idade é: " + media);





    }
}
