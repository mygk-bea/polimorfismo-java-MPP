package exerc7;

public class Venda {
    public void vender(TipoPagamento pagto, double valor) {
        pagto.pagar(valor);
    }
}
