package exerc8;

public class Compra {
    public void finalizarCompra(TipoEntrega tipo) {
        tipo.calcularFrete();
        tipo.tempoEntrega();
    }
}
