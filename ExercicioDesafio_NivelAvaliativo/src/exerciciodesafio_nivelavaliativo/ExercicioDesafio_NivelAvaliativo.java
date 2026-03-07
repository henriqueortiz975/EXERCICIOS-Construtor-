
package exerciciodesafio_nivelavaliativo;

public class ExercicioDesafio_NivelAvaliativo {
    
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Henrique", 17);
        p1.exibirDados();
        System.out.println("");
        
        Pessoa p2 = new Pessoa("Arthur", 16);
        p2.fazerAniversario();
        p2.exibirDados();   
        System.out.println("");
        
        Pessoa p3 = new Pessoa("Miguel", -15);
        p3.exibirDados();
    }
    
}
