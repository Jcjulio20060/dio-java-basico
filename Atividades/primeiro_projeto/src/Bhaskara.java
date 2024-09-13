import java.util.Scanner;

public class Bhaskara {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        processo x = new processo();
        System.out.println("Digite o valor de A: ");
        x.a = sc.nextDouble();
        System.out.println("Digite o valor de B: ");
        x.b = sc.nextDouble();
        System.out.println("Digite o valor de C: ");
        x.c = sc.nextDouble();
        x.calcula();
    }
}