package exercicio5_classeretangulo_.comregras;

public class Exercicio5_ClasseRetangulo_ComRegras {

    public static void main(String[] args) {
        Retângulo objforma = new Retângulo(10, 10);
        objforma.calcularArea();
        objforma.calcularPerimetro();
        System.out.println("É quadrado? " + objforma.ehQuadrado());

    }
    
}
