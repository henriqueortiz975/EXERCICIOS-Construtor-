package exercicio3_classe_contacorrente;

public class Exercicio3_Classe_ContaCorrente {

    public static void main(String[] args) {
        Conta objconta = new Conta("Fernando da Silva", +554325654);
        objconta.depositar(1304.55);
        objconta.sacar(1000.45);
        objconta.consultarSaldo();
    }
    
}
