package br.com.fecaf.model;

import java.util.Scanner;

public class Circulo {
    public double raio;
    public double area;
    public double perimetro;
    Scanner scanner;

    public Circulo() {
        this.scanner = new Scanner(System.in);
    }

    public boolean cadastrarCirculo() {
        System.out.println("/******************************/");
        System.out.println("/*      Cadastro Circulo      */");
        System.out.println("/******************************/");
        System.out.print("Informe o raio do circulo: ");
        this.raio = this.scanner.nextDouble();
        System.out.println("Circulo Cadastrado com Sucesso !");
        System.out.println("/******************************/");
        return true;
    }

    public void calcularArea() {
        System.out.println("/* Calculando Area */");
        this.area = Math.PI * Math.pow(this.raio, (double)2.0F);
        System.out.println("A area é " + this.area);
    }

    public void calcularPerimetro() {
        System.out.println("/* Calculando o Perimetro */");
        this.perimetro = (Math.PI * 2D) * this.raio;
    }
}
