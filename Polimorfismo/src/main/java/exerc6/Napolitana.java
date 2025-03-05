package exerc6;

public class Napolitana implements Pizza{

    @Override
    public void preparar(String tipoBorda) {
        System.out.println("Molho, presunto, queijo, tomate, oregano. Borda: " + tipoBorda);
    }
    
    @Override
    public void assar() {
        System.out.println("19 minutos");
    }
    
    @Override
    public void cobrar() {
        System.out.println("R$ 18,00");
    } 
}
