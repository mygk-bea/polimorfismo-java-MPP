package exerc1;

public class Exerc1 {
    public static void main(String[] args) {
        // 1. Chamada do método normal
        Torcedor torcedor = new Torcedor();
        torcedor.torcer();
        
        // 2. Chamadas polimórficas
        torcedor = new Corinthians();
        torcedor.torcer();
        
        torcedor = new Palmeiras();
        torcedor.torcer();
       
        torcedor = new Santos();
        torcedor.torcer();
    }
}
