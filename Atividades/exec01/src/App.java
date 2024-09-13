import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual é o valor do produto ? ");
        float valor = sc.nextFloat();
        int maispagamentos = 0;
        System.out.print("Qual vai ser a forma de pagamento ? ");
        String forma = sc.next();
        if(forma.equals("credito")){
            System.out.print("Você vai dividir em quantas vezes ? ");
            maispagamentos = sc.nextInt();
        }
        sc.close();
        processo ps = new processo();
        ps.valorProduto = valor;
        ps.formaPagamento = forma;
        ps.result = maispagamentos;
        ps.verificarFormaPagamento();
    }
}