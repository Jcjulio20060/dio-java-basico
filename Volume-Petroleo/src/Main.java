import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.print("Olá! Por favor! Digite o valor do raio: ");
        float raio = sc.nextFloat();
        System.out.print("Agora preciso da altura: ");
        float altura = sc.nextFloat();
        sc.close();
        double volume = Math.PI * Math.pow(raio, 2) * altura;
        System.out.println("O volume da lata de petróleo é de: " + df.format(volume));
    }
}