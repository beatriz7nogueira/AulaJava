import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        double valor, convertido;
        System.out.println("Digite o valor em dolar da doação: ");
        valor  = leitura.nextDouble();
        convertido = (valor * 5.98);
        System.out.println("O valor em reais: " + convertido);
        System.out.println();








        }
    }
