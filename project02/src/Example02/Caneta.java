package Example02;

import javax.print.event.PrintEvent;

public class Caneta {
        public String modelo;
        public String cor;
        private int ponta;
        protected float carga;
        protected boolean tampada;
        
        public void escrever(){
            if (tampada) {
                System.out.println("Caneta tamapda");
            }else{
                System.out.println("Escrevendo");
            }
        }
        private void rabiscar(){}
        
        public void status(){
            System.out.println("A caneta é do modelo: " + modelo);
        }

        public void tampar(){
            this.tampada = true;
        }

        public void destampar(){
            this.tampada = false;
        }
}
