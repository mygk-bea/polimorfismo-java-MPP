package exerc7;

public class CartaoCredito implements TipoPagamento{
    @Override
    public void pagar(double valor) {
        double taxa = (valor/100)*20;
        System.out.println("Pagamento em cartão. Valor da taxa é: R$" + taxa);
    };
}
