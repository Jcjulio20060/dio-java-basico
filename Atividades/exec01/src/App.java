import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        processo calc = new processo();
        System.out.println("********Sistema de Vendas********");
        System.out.println("1 - À vista no PIX");
        System.out.println("2 - Cartão com 10% de desconto");
        System.out.println("3 - Cartão parcelado em duas vezes");
        System.out.println("4 - Cartão parcelado em mais de duas vezes");
        System.out.print("Qual é a sua opção de escolha ? ");
        int choice = sc.nextInt();
        System.out.print("Qual é o valor do produto ? ");
        calc.valorProduto = sc.nextFloat();
        switch (choice){
            case 1:
                calc.PIX
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
    }
}