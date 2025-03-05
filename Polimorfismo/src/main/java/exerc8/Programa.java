package exerc8;

public class Programa {
    public static void main(String[] args) {
        Compra compra = new Compra();
        Padrao e_Padrao = new Padrao();
        Expressa e_Expressa = new Expressa();
        Retirada e_Retirada = new Retirada();
        
        compra.finalizarCompra(e_Padrao);
        compra.finalizarCompra(e_Expressa);
        compra.finalizarCompra(e_Retirada);
    }
}
