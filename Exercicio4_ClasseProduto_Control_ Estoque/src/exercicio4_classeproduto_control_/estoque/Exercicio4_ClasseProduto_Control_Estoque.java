package exercicio4_classeproduto_control_.estoque;

public class Exercicio4_ClasseProduto_Control_Estoque {

    public static void main(String[] args) {
        Produto objproduto = new Produto("mochila", 32.20);
        objproduto.entradaEstoque(45);
        objproduto.saidaEstoque(23);
        objproduto.status();
        objproduto.valorTotalEstoque();
    }
    
}
