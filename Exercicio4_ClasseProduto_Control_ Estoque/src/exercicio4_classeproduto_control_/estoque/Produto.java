package exercicio4_classeproduto_control_.estoque;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade = 0;
    
    public Produto(String nome, double preco){
        this.nome = nome;
        
        if(preco >= 0){
            this.preco = preco;
        }else{
            System.out.println("valor invalido");
        }
    }
    public void status(){
        System.out.println("Nome do produto: " + nome);
        System.out.println("preço do produto: " + preco);
    }
    public void entradaEstoque(int qtd){
        this.quantidade = qtd;
        System.out.println("A quantidade de adiçção do estoque " + qtd);
    }
    
    public void saidaEstoque(int qtd){
        quantidade -= qtd;
        System.out.println("A quantidade de diminuição do estoque: " + qtd);
    }
    
    public void valorTotalEstoque(){
        System.out.println("Estqoue final: " + quantidade);
    }
    
}
