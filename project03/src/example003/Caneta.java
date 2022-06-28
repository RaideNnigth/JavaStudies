package example003;
public class Caneta {
    private String cor;
    private String modelo;
    private int ponta;
    private boolean tampada;
    public Caneta(){
        this.tampada = false;
        this.cor = "azul";
    }
    public Caneta(int p, String m, boolean t, String c){
        this.tampada = t;
        this.cor = c;
        setPonta(p);
        setModelo(m);
    }
    public String getModelo(){
        return this.modelo;
    }
    public int getPonta(){
        return this.ponta;
    }
    public void setModelo(String m){
        this.modelo = m;
    }
    public void setPonta(int p){
        this.ponta = p;
    }
    public void escrever(){
        if (tampada) {
            System.out.println("Caneta tamapda");
        }else{
            System.out.println("Escrevendo");
        }
    }
    
    public void status(){
        System.out.println("Sobre a caneta:");
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ponta: " + getPonta());
    }

    public void tampar(){
        this.tampada = true;
    }

    public void destampar(){
        this.tampada = false;
    }
}
