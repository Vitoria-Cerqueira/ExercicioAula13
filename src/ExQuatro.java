import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExQuatro {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int qtaIdades, idades;
        double media=0;

        System.out.println("Digite a quantidade de idade que voce quer adicionar: ");
        qtaIdades = teclado.nextInt();

        List<Integer> idade = new ArrayList<>();

        for (int i = 0; i < qtaIdades; i++) {
            System.out.println("Informe sua idade: ");
            idade.add(idades=teclado.nextInt());
        }

        System.out.println("IDADES " + idade);

        int total =0;
        for (int i = 0; i < idade.size(); i++) {
            total += idade.get(i);
        }
        System.out.println("Total da soma das idades: " + total);

        System.out.println("------------------------------------------");

        media = total / idade.size();
        System.out.println("A media das idades é: " + media);





    }
}
