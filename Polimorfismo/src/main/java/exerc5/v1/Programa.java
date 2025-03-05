package exerc5.v1;

public class Programa {
    public static void main(String[] args) {
        Forno forno = new Forno();
        Calabresa calabresa = new Calabresa();
        Napolitana napolitana = new Napolitana();
        
        forno.fabricar(calabresa);
        forno.fabricar(napolitana);
    }
}
