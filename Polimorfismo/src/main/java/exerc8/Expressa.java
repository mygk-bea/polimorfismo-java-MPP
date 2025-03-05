package exerc8;

public class Expressa implements TipoEntrega{
    @Override
    public void calcularFrete(){
        System.out.println("Entrega expressa. Frete de R$25,00");
    };
    
    @Override
    public void tempoEntrega(){
        System.out.println("Entrega expressa. Até 1 semana");
    };
}
