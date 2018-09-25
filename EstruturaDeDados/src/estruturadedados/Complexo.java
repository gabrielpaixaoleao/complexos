package estruturadedados;

public class Complexo {
    private double imaginario;
    private double real;
    private double i;

    public Complexo(double real, double imaginario){
        this.real = real;
        this.imaginario = imaginario;
    }
    
    public void soma (Complexo comp){
        this.real = this.real + comp.real;
        this.imaginario = this.imaginario + comp.imaginario;
        System.out.println("Soma efetuada! ");
    }
    
    public void subtracao (Complexo comp){
        this.real = this.real - comp.real;
        this.imaginario = this.imaginario - comp.imaginario;
        System.out.println("Subtração efetuada!");
    }
    
    public void multiplicacao(Complexo comp){
        double realReal = this.real * comp.real;
        double realImaginario = this.real * comp.imaginario;
        double imaginarioReal = this.imaginario * comp.real;
        double imaginarioImaginario = this.imaginario * comp.imaginario;
        imaginarioImaginario = imaginarioImaginario * (-1);
        this.imaginario = realImaginario + imaginarioReal;
        this.real = realReal + imaginarioImaginario;
        System.out.println("Multiplicação efetuada!");  
    }
    
    public void setImaginario(double imaginario){
        this.imaginario = imaginario;
    }
    
    public double getImaginario(){
        return this.imaginario;
    }
    
    public void setReal(double real){
        this.real = real;
    }
    
    public double getReal(){
        return this.real;
    }
}