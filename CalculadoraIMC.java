package Aplication;

import entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class CalculadoraIMC {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Pessoa pessoa = new Pessoa();

        System.out.println("Olá qual o seu nome?");
        String Nome = sc.nextLine();
        System.out.println("qual o seu peso?");
        double Peso = sc.nextDouble();
        sc.nextLine();
        System.out.println("qual a sua altura?");
        double Altura = sc.nextDouble();
        sc.nextLine();
        System.out.println(pessoa.toString());


    }
}
