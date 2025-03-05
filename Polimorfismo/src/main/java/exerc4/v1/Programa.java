package exerc4.v1;

public class Programa {
    public static void main(String[] args) {
        Forno forno = new Forno();
        PizzaCalabresa calabresa = new PizzaCalabresa();
        forno.fabricar(calabresa);
        
        // Código que mostra o erro da execução
        PizzaNapolitana napolitana = new PizzaNapolitana();
        forno.fabricar(napolitana);
    }
}
