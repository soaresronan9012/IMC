package entities;

public class Pessoa {
    private String nome;
    private double peso;
    private double altura;
    public double x = (peso/(altura*altura));

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calculo(){
      return   peso/(altura*altura);
    }


    /*public Pessoa(){
        this.nome = nome;
        this.peso = peso;
        this.altura = altura; } */


    public String toString (){
        return  " Seu IMC ( indice de massa corporal ), é " + x;

    }

    }





