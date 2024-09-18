public class processo {  // Por convenção, nomes de classes começam com letra maiúscula.
    float valorProduto;
    int quant;

    public void PIX(){
        valorProduto -= valorProduto * 0.15;
        System.out.println("O valor final da compra deu: " + valorProduto);
    }
    public void CARTAO(){
        valorProduto -= valorProduto * 0.1;
        System.out.println("O valor final da compra deu: " + valorProduto);
    }
    public void CARTAO2(){
        valorProduto /= 2;
        System.out.println("O valor final da compra parcelado em 2 vezes deu: " + valorProduto);
    }
    public void CARTAON(){
        valorProduto += valorProduto * 0.10;
        valorProduto /= quant;
        System.out.println("O valor final da compra parcelado em " + quant + " vazes deu: " + valorProduto);
    }
}
