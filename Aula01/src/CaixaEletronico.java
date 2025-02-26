import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        /*
        Valor do saque: 180 (ED)
        Notas de R$ 50: 3
        Notas de R$ 20: 1
        Notas de R$ 10: 1
        * */
        Scanner leitor = new Scanner(System.in);
        System.out.println("Valor do saque: R$ ");
        int quantia = leitor.nextInt();
        int nota50, nota20, nota10;
        nota50 = quantia / 50; //3 notas
        //quantia = quantia % 50; //30 reais o que sobrou
        quantia %= 50;
        nota20 = quantia / 20; //1
        quantia = quantia % 20; //10
        nota10 = quantia / 10;
        System.out.printf("\n%d nota(s) de R$ 50\n", nota50);
        //%d => inteiros | %f => double (%.2f) => 2 casas decimais
        System.out.println(nota20 + " nota(s) de R$ 20");
        System.out.println(nota10 + " nota(s) de R$ 10");



    }
}
