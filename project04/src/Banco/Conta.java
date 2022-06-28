package Banco;
import java.util.Random;

public class Conta {
    public int contaId;
    protected String contaTipo;
    private String donoName;
    private int saldo;
    private boolean status;

    public int getContaId() {
        return this.contaId;
    }

    public void setContaId(int contaId) {
        this.contaId = contaId;
    }

    public String getContaTipo() {
        return this.contaTipo;
    }

    public void setContaTipo(String contaTipo) {
        this.contaTipo = contaTipo;
    }

    public String getDonoName() {
        return this.donoName;
    }

    public void setDonoName(String donoName) {
        this.donoName = donoName;
    }

    public int getSaldo() {
        return this.saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void abrirConta(){
        Random rand = new Random();
        if ("cc".equals(getContaTipo())) {
            setSaldo(getSaldo() + 50);
            setContaId(rand.nextInt(100));
            System.out.println("Conta Aberta!");
        }else if ("cp".equals(getContaTipo())) {
            setSaldo(getSaldo() + 150);
            setContaId(rand.nextInt(100));
            System.out.println("Conta Aberta!");
        }else{
            System.out.println("Primeiro você deve se definir o tipo de conta");
        }

    }
    public void fecharConta(){
        if (getSaldo() == 0) {
            setStatus(false);
            System.out.println("Conta fechada!");
        }else if(getSaldo() < 0){
            System.out.println("Pague as suas dividas primeiro de: " + getSaldo());
        }else{
            System.out.println("Primeiro retire o dinheiro da conta, valor de: " + getSaldo());
        }
    }
    public void depositar(int valor){
        setSaldo(getSaldo() + valor);
    }
    public void sacar(int valor){
        setSaldo(getSaldo() - valor);
    }
    public void pagarMensal(){
        if (isStatus()) {
            if ("cc".equals(getContaTipo())) {
                setSaldo(getSaldo() - 12);
            }else{
                setSaldo(getSaldo() - 20);
            }
        }
    }
}
