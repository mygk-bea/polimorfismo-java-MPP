package exerc6;

public class AlhoBacon implements Pizza {

    @Override
    public void preparar(String tipoBorda) {
        System.out.println("Molho, queijo, alho, bacon, oregano. Borda:" + tipoBorda);
    }
    
    @Override
    public void assar() {
        System.out.println("13 minutos");
    }
    
    @Override
    public void cobrar() {
        System.out.println("R$ 22,00");
    }
}
