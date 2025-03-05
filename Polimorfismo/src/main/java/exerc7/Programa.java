package exerc7;

public class Programa {
    public static void main(String[] args) {
        Venda venda = new Venda();
        Dinheiro dinheiro = new Dinheiro();
        CartaoCredito credito = new CartaoCredito();
        Boleto boleto = new Boleto();
        
        venda.vender(boleto, 100);
        venda.vender(credito, 100);
        venda.vender(dinheiro, 100);
    }
}
