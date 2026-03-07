package exercicio2_classefuncionário;

public class Funcionario {
    private String nome;
    private double salario; 
    private String cargo;
    
    public Funcionario(String nome, double salario, String cargo){
        this.nome = nome;
        this.cargo = cargo;
        
        if(salario >= 0){
            this.salario = salario;
        }else{
            System.out.println("Salário invalido");
        }
    }
    
    public void aumentarSalario(double percentual){
        System.out.println("Aumento do salario em: " + percentual+ "%");
        if(salario >= 0){
            salario = salario + (salario * percentual / 100);
            System.out.println("Salario com aumento: " + salario);
        }else{
            System.out.println("Aumento invalido");
        }        
    }
    
    public void exibirDados(){
        System.out.println("Nome do funcionario: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: " + salario);
    }
        
}
