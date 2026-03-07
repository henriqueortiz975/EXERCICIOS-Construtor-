package exercicio5_classeretangulo_.comregras;

public class Retângulo {
    private double largura;
    private double altura;
    
    public Retângulo(double largura, double altura){
        if(largura > 0 && altura > 0){
            this.altura = altura;
            this.largura = largura;
            System.out.println("largura: " + largura);
            System.out.println("altura: " + altura);            
        }else{
            System.out.println("Um ou os dois valores estão incorretos");
        }
    }
    
    public void calcularArea(){
        double area;
        area = (altura*largura)*2;
        System.out.println("Area: " + area);
    }
    
    public void calcularPerimetro(){
        double perimetro;
        perimetro = (altura+largura)*2;
        System.out.println("Perimetro: " + perimetro);
    }
    
    public boolean ehQuadrado() {
        return largura == altura;
    }
}
