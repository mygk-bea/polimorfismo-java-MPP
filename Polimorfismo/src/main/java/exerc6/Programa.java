package exerc6;

public class Programa {
    public static void main(String[] args) {
        Forno forno = new Forno();
        Calabresa calabresa = new Calabresa();
        Napolitana napolitana = new Napolitana();
        AlhoBacon alhoBacon = new AlhoBacon();
        
        forno.fabricar(calabresa, "Normal");
        forno.fabricar(napolitana, "Catupiry");
        forno.fabricar(alhoBacon, "Normal");
    }
}
