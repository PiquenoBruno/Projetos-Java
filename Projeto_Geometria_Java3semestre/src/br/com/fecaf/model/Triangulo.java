package br.com.fecaf.model;

import java.util.Scanner;

public class Triangulo {
    public double lado1;
    public double lado2;
    public double base;
    Scanner scanner;

    public Triangulo() {
        this.scanner = new Scanner(System.in);
    }

    public boolean cadastrarTriangulo() {
        System.out.println("CADASTRAR TRIÂNGULO \n ---------------------");
        System.out.println("Informe o lado 1:");
        this.lado1 = this.scanner.nextDouble();
        System.out.println("Informe o lado 2:");
        this.lado2 = this.scanner.nextDouble();
        System.out.println("informe o lado 3:");
        this.base = this.scanner.nextDouble();

        //Aqui estou validando se é um triangulo "Existente", se os dados informados realmente
        //formam uma forma geometrica e se não é negativo, para não dar erro nas outras funçoes
        if (this.lado1 <= 0 || this.lado2 <= 0 || this.base <= 0) {
            System.out.println("apenas numeros positivos");
            return cadastrarTriangulo();
        }
        //essa é a formula pra saber se um triangulo existente pelo que eu vi
        if (this.lado1 + this.lado2 <= this.base ||
                this.lado1 + this.base <= this.lado2 ||
                this.lado2 + this.base <= this.lado1) {
            System.out.println("Os valores não formam um triângulo");
            return cadastrarTriangulo();
        }
        System.out.println("---------------------\nTRIÂNGULO CADASTRADO");
        return true;
    }

    public void validarTriangulo() {
        if (this.lado1 == this.lado2 && this.lado1 == this.base) {
            System.out.println("É um triângulo equilátero");
        } else if (this.lado1 == this.lado2 || this.lado2 == this.base || this.lado1 == base) {
            System.out.println("É um triângulo isósceles");
        } else {
            System.out.println("É um triângulo escaleno");
        }

    }

    //como só tem 3 possibilidades para calcular, repeti 3 vezes em ordem diferentes se atender um dos calculos
    // é um triangulo retangulo
    public boolean validarTrianguloRetangulo() {
        if (this.lado1 * this.lado1 + this.lado2 * this.lado2 == this.base * this.base ||
                this.lado1 * this.lado1 + this.base * this.base == this.lado2 * this.lado2 ||
                this.base * this.base + this.lado2 * this.lado2 == this.lado1 * this.lado1) {
            System.out.println("É um triângulo retangulo");
            return true;
        } else {
            System.out.println("Não é um triângulo retangulo");
            return false;
        }
    }

    public void validarTriangulo345() {
        //tive que pesquisar como verificar qual numero é o maior para indentificar a hipotenusa "Math.max"
        double hipotenusa = Math.max(this.lado1, Math.max(this.lado2, this.base));
        double cateto1, cateto2;
        //aqui só ta organizando os dados depois que descobre qual é a hipotenusa
        if (hipotenusa == this.lado1) {
            cateto1 = this.lado2;
            cateto2 = this.base;
        } else if (hipotenusa == this.lado2) {
            cateto1 = this.lado1;
            cateto2 = this.base;
        } else {
            cateto1 = this.lado2;
            cateto2 = this.lado1;
        }
        //aqui não sei se foi gambiarra, mas verifica se é um triangulo retangulo depois verifica se é multiplo de 345
        //tava com duvida como organizar os catetos na ordem da divisão, mas como só tem duas possibilidades
        // repeti o codigo duas vezes em ordem diferente
        //e se atender uma dessas contas é um triangulo 345
        if (hipotenusa * hipotenusa == cateto1 * cateto1 + cateto2 * cateto2) {
            if ((cateto1 % 3 == 0 && cateto2 % 4 == 0 && hipotenusa % 5 == 0) ||
                    (cateto2 % 3 == 0 && cateto1 % 4 == 0 && hipotenusa % 5 == 0)) {
                System.out.println("É um triângulo 345");
            } else {
                System.out.println("Não é um triângulo 345");
            }
        } else {
            System.out.println("não é um triângulo retangulo, logo não é um triângulo 345");
        }

    }
}