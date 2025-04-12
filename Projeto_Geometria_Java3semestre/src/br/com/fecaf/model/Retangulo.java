package br.com.fecaf.model;

import java.util.Scanner;

public class Retangulo {
    public double lado1;
    public double lado2;
    public double area;
    public double perimetro;
    Scanner scanner;

    public Retangulo() {
        this.scanner = new Scanner(System.in);
    }

    public boolean cadastrarRetangulo() {
        System.out.println("/*************************/");
        System.out.println("/** Cadastrar Retangulo **/");
        System.out.println("/*************************/");
        System.out.print("Informe o lado 1: ");
        this.lado1 = this.scanner.nextDouble();
        System.out.println("Informe o lado 2: ");
        this.lado2 = this.scanner.nextDouble();
        System.out.println("Retangulo Cadastrado com Sucesso !");
        System.out.println("/***********************************/");
        return true;
    }

    public void calcularArea() {
        System.out.println("/* Calculando Area */");
        this.area = this.lado1 * this.lado2;
        System.out.println("A area é: " + this.area);
    }

    public void calcularPerimetro() {
        System.out.println("/* Calculando Perimetro */");
        this.perimetro = this.lado1 * (double)2.0F + this.lado2 * (double)2.0F;
        System.out.println("O Perimetro é: " + this.perimetro);
    }
    public boolean definirQuadrado() {
        if (this.lado1 == this.lado2) {
            System.out.println("Isso é um Quadrado ...");
            return true;
        } else {
            System.out.println("Não é um Quadrado ...");
            return false;
        }
    }
}
