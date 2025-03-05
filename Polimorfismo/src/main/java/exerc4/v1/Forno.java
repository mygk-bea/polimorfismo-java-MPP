package exerc4.v1;

public class Forno {
    public void fabricar(PizzaCalabresa calabresa) {
        calabresa.preparar();
        calabresa.assar();
        calabresa.cobrar();
    }
    
    // Código adicionado para tirar o erro da execução
    public void fabricar(PizzaNapolitana napolitana) {
        napolitana.preparar();
        napolitana.assar();
        napolitana.cobrar();
    }
}
