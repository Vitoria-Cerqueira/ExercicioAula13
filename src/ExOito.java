import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExOito {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);



        List<Double> salario = new ArrayList<>();

        int num;

        System.out.println("Quantos salarios serao inseridos? ");
        num = teclado.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.println("Informe o salario");
            salario.add(teclado.nextDouble());

        }
        double reajuste;

        System.out.println("Informe a porcentagem de reajuste: ");
        double porcent = teclado.nextDouble();

        List<Double> salarioAtual = new ArrayList<>();
        System.out.println("Salarios atualizados");

        for (int i = 0; i < salario.size(); i++) {
            reajuste = (salario.get(i)*porcent)/100+salario.get(i);
            salarioAtual.add(reajuste);
            System.out.println(salarioAtual.get(i));
        }


    }
}
