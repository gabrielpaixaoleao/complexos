package estruturadedados;

public class EstruturaDeDados {

    public static void main(String[] args) {
        
        //criando dois objetos do tipo Complexo e passando dois valores inteiros (nesse caso, também poderia ser um double) para o construtor da classe
        Complexo comp = new Complexo(2, 5);
        Complexo comp2 = new Complexo(3, 2);
        
        
        System.out.println("Um número complexo segue o padrão z = a + bi");  
        
        //Invocando o metodo de multiplicação, passando um objeto do tipo Complexo como parâmetro
        comp.multiplicacao(comp2);
        
        
        //Mostrando o resultado das operações, tanto da parte real, quanto da imaginaria
        System.out.println("Parte real: " + comp.getReal());
        System.out.println("Parte imaginaria: " + comp.getImaginario());
    } 
}