import java.util.Scanner;
//*Não consegui fazer*
public class ExNove {
    public static void main(String[] args) {

        int num[] = new int[50];
        int valor = 101;

        for (int i = 0; i < num.length  ; i++) {
            num[i] = valor; // o indice 0 está começando com 101 (na primeira rodada do for)
            System.out.println(num[i]);
            valor++;
            if (valor > 150){
                break;
            }

    }
}
}
