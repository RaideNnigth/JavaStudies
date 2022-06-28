package example01;
public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    public void rabiscar(){
        if (this.tampada){
            System.out.println("Não pode Rabiscar, \na caneta está tampada!");
        }else{
            System.out.println("Rabiscando!!!!");
        }
    }
    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }
    public void status(){
        System.out.println("Uma caneta " + this.cor);
        System.out.println("está tampada? " + this.tampada);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Modelo: " + this.modelo);
    }
}
