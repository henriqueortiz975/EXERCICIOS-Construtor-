package exercicio2_classefuncionário;

public class Funcionario {
    
    private String nome;
    private double salario; 
    private String cargo;
    
    public Funcionario(String nome1, double salario1, String cargo1){
        this.nome = nome1;
        this.cargo = cargo1;
        
        if(salario1 >= 0){
            this.salario = salario1;
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
        System.out.println("Salário: " + salario);
        System.out.println("Cargo: " + cargo);

    }     
}
