package Example02;
public class App {
    public static void main(String[] args) throws Exception {
        Caneta c1 = new Caneta();
        c1.modelo = "Bic";
        c1.cor = "Vermelho";
        c1.carga = 100;
        c1.destampar();
        c1.escrever();
    }
}
