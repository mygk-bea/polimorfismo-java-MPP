package exerc7;

public class Boleto implements TipoPagamento{
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento em boleto. Taxa fixa R$0,80");
    };
}
