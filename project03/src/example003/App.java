package example003;
public class App {
    public static void main(String[] args) throws Exception {
        Caneta c1 = new Caneta(2, "Bic", false, "vermelho");
        c1.destampar();
        c1.status();
    }
}
