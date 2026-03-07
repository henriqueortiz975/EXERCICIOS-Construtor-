
package exerciciodesafio_nivelavaliativo;

public class Pessoa {
    private String nome;
    private int idade;
    
    public Pessoa(String nome, int idade){
        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("Nome invalido");
        }
        
        if (idade >= 0) {
            this.idade = idade;
        } else {
            System.out.println("Idade invalida");
        }      
    }
    
    public void fazerAniversario() {
        idade++;
    }
    
    public void exibirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);        
    }
    
}
