package example01;
public class App {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "Vermelha";
        c1.modelo = "Bic";
        c1.ponta = .1f;
        c1.carga = 100;
        c1.tampada = true;
        c1.status();
        c1.rabiscar();
        c1.destampar();
        c1.status();
        c1.rabiscar();
    }
}
