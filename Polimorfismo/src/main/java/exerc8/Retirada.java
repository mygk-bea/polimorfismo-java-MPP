package exerc8;

public class Retirada implements TipoEntrega{
    @Override
    public void calcularFrete(){
        System.out.println("Retirada na loja. Frete grátis");
    };
    
    @Override
    public void tempoEntrega(){
        System.out.println("Retirada na loja. Disponível a partir de 30 minutos após a compra");
    };
}
