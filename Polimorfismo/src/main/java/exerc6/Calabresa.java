package exerc6;

public class Calabresa implements Pizza {

    @Override
    public void preparar(String tipoBorda) {
        System.out.println("Molho, queijo, calabresa, cebola e tomate. Borda: " + tipoBorda);
    }
    
    @Override
    public void assar() {
        System.out.println("15 minutos");
    }
    
    @Override
    public void cobrar() {
        System.out.println("R$ 12,00");
    }
}
