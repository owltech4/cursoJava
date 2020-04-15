import java.util.Scanner;

public class CapturaData {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int dd, mm, aaaa, resto, numero;
        System.out.print("\nDigite uma data com o formato DDMMAAAA, por favor ");
        numero = teclado.nextInt();

        resto = numero/10000;
        aaaa = numero % 10000;

        dd = resto / 100;
        mm = resto % 100;

        System.out.println("\nO ano da sua data inserida: "+aaaa);
        System.out.println("O mes da sua data inserida: "+mm);
        System.out.println("O dia da sua data inserida: "+dd);

    }
}