package exerc8;

public class Padrao implements TipoEntrega{
    @Override
    public void calcularFrete(){
        System.out.println("Entrega padrão. Frete de R$10,00");
    };
    
    @Override
    public void tempoEntrega(){
        System.out.println("Entrega padrão. De 1 - 3 semanas");
    };
}
