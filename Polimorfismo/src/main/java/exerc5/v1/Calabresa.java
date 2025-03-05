package exerc5.v1;

public class Calabresa implements Pizza {

    @Override
    public void preparar() {
        System.out.println("molho, queijo, calabresa, cebola e tomate");
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
