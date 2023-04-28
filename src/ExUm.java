import java.util.Scanner;

public class ExUm {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int a,b,c;

        System.out.println("Digite um numero A: ");
        a = teclado.nextInt();

        System.out.println("Digite um numero B: ");
        b = teclado.nextInt();

        if (a==b){
            c = a+b;
            System.out.println("O resultado de A + B é: " + c);
         }else {
            c = a*b;
            System.out.println("O resultado de A*B é: " + c);
        }
    }
}