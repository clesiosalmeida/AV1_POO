package pergunta3;

public class Mensalidade{
    private double valorMensalidade; 
    private int numeroIrmaos;
    
    

    public Mensalidade(double valorMensalidade, int numeroIrmaos) {
        this.valorMensalidade = valorMensalidade;
        this.numeroIrmaos = numeroIrmaos;
    }



    public void calculaMensalidade(){
        //desconto mensalidade

        if (this.numeroIrmaos == 1){
            System.out.println("Valor da mensálidade com desconto de 5%: "+this.valorMensalidade*0.95);
        }else if(this.numeroIrmaos == 2){
            System.out.println("Valor da mensálidade com desconto de 10%: "+this.valorMensalidade*0.90);
        }else if (this.numeroIrmaos > 2){
            System.out.println("Valor da mensálidade com desconto de 15%: "+this.valorMensalidade*0.90);
        }



    }
    
}