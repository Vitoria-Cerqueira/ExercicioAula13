import java.util.Scanner;
//*Não consegui fazer*
public class ExNove {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num[] = new int[5];

        for (int i = 101; i <num.length; i++) {
            num[i] = num[i]++;

            System.out.println(num[i]);
        }
    }
}
