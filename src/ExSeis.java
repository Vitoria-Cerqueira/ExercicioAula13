import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//*Não consegui fazer*
public class ExSeis {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int qtaNum;
        int soma = 0;

        System.out.println("Digite a quantidade de idade que voce quer adicionar: ");
        qtaNum = teclado.nextInt();

        List<Integer> numeros = new ArrayList<>();
        for (int i = 0; i < qtaNum; i++) {

            System.out.println("Digite um numero: ");
            numeros.add(teclado.nextInt());
            if (numeros.get(i) >0){


                soma+= numeros.get(i);



            }else {
                System.out.println("Um numero negativo foi digitado! ");
                break;
            }

        }
        System.out.println("Resultado da soma é: " + soma);



    }
}
