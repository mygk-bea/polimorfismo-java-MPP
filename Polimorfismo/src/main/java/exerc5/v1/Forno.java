package exerc5.v1;

public class Forno {
    public void fabricar(Pizza pizza) {
        // pizza é uma referência POLIMÓRFICA
        // objeto variável e dinâmico
        pizza.preparar();
        pizza.assar();
        pizza.cobrar();
    }
}
