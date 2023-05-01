import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExTres {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        List<Integer> notas = new ArrayList<>();

        int numIdent;
        int nota;
        int soma = 0;
        double medEx;
        double medAp;

        System.out.println("Informe o número de identificação do aluno: ");
        numIdent = teclado.nextInt(); // entrada de dados e coletar numero de identificação


        for (int i = 0; i < 3; i++) { //pra coletar as tres notas
            System.out.println("Informe a nota do aluno: ");
            nota = teclado.nextInt();
            notas.add(nota);  // adicionando uma nota a list

            soma += notas.get(i); //somar

        }
        medEx = soma / 3.0; //media exercicios

        medAp = notas.get(0) + notas.get(1) * 2 + notas.get(2) * 3 + medEx / 7; //med aproveitamento

//RESULTADOS

        System.out.println("Aluno: " + numIdent); //num aluno

        System.out.println("NOTAS"); //nota aluno

        for (int i = 0; i < notas.size(); i++) { //tres notas
            System.out.println("Nota: " + notas.get(i));
        }

        System.out.println("Media Exercicios: " + medEx);


        System.out.print("Media de Aproveitamento: ");
        if (medAp >= 90) { //A
            System.out.print("APROVADO");
        } else if (medAp >= 75 && medAp < 90) { //B
            System.out.print("APROVADO");
        } else if (medAp >= 60 && medAp < 75) { //C
            System.out.print("APROVADO");
        } else if (medAp >= 40 && medAp < 60) { //D
            System.out.print("REPROVADO");
        } else if (medAp < 40) { //E
            System.out.print("REPROVADO");
        } else {

            System.out.print("Error");

        }

    }
}