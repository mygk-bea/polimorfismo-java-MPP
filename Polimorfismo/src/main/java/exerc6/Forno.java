package exerc6;

public class Forno {
    public void fabricar(Pizza pizza, String tipoBorda) {
        pizza.preparar(tipoBorda);
        pizza.assar();
        pizza.cobrar();
    }
}
