package exercicio3_classe_contacorrente;

public class Conta {
    private String titular;
    private int numero;
    private double saldo = 0;
    
    public Conta(String titular, int numero){
        this.titular = titular;
        this.numero = numero;
    }
    
    public void depositar(double valor){
       if(valor > 0){
         saldo += valor;
           System.out.println("valor depositado: " + valor);
       }else{
           System.out.println("valor invalido");
       }
    }
    
    public void sacar(double valor){
        if(valor < saldo){
            saldo -=valor;
            System.out.println("valor sacado: " + valor);
        }else{
            System.out.println("saque invalido");
        }
    }
    
    public void consultarSaldo(){
        System.out.println("Titular da conta: " + titular);
        System.out.println("Numero: " + numero);
        System.out.println("saldo final: " + saldo);
    }
    
}
