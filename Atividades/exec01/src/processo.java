public class processo {  // Por convenção, nomes de classes começam com letra maiúscula.
    float valorProduto;
    String formaPagamento;
    int result;
    public void verificarFormaPagamento() {  // Método para verificar a forma de pagamento.
        if (formaPagamento.equals("dinheiro") || formaPagamento.equals("pix")) {
            // Lógica para pagamento em dinheiro ou pix
            valorProduto -= (valorProduto * 0.15);
        } else if (formaPagamento.equals("credito") && result == 1) {
            // Lógica para pagamento no crédito e result == 1
            valorProduto -= (valorProduto * 0.1);
        } else if (formaPagamento.equals("credito") && result >= 3) {
            // Lógica para pagamento no crédito e result == 2
            valorProduto += (valorProduto * 0.1);
            valorProduto /= result;
        } else {
            valorProduto /= result;
        }
        if(result >= 2){
            System.out.println("O valor do produto parcelado deu: " + valorProduto);
        } else{
            System.out.println("O valor do produto à vista deu: " + valorProduto);
        }
    }
}
