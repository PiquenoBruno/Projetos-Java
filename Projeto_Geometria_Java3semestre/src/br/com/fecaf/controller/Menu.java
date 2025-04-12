package br.com.fecaf.controller;

import br.com.fecaf.model.Circulo;
import br.com.fecaf.model.Retangulo;
import br.com.fecaf.model.Triangulo;

import java.util.Scanner;

public class Menu {

    // Instancia Teclado
    Scanner scanner = new Scanner(System.in);

    public void executarMenu () {


        boolean exit = false;

        while (!exit) {
            System.out.println("/*******************/");
            System.out.println("/*    Geometria    */");
            System.out.println("/*******************/");
            System.out.println("/* 1 - Circulo     */");
            System.out.println("/* 2 - Retângulo   */");
            System.out.println("/* 3 - Triângulo   */");
            System.out.println("/* 4 - Sair        */");
            System.out.println("/*******************/");

            System.out.print("Informe a opção desejada: ");
            int optionUser = scanner.nextInt();

            switch (optionUser) {
                case 1:

                    boolean exitCirculo = false;

                    Circulo circulo = new Circulo();

                    boolean validaCadastroCirculo = false;



                    while (!exitCirculo) {

                        System.out.println("--------------------\nCirculo\n--------------------");
                        System.out.println("/* 1 - Cadastrar Circulo  */");
                        System.out.println("/* 2 - Calcular Area      */");
                        System.out.println("/* 3 - Calcular Perimetro */");
                        System.out.println("/* 4 - Sair               */");
                        System.out.print("Informe a opção: ");

                        int optionCirculo = scanner.nextInt();


                        switch (optionCirculo) {
                            case 1:
                                validaCadastroCirculo = circulo.cadastrarCirculo();
                                break;
                            case 2:
                                if (validaCadastroCirculo) {
                                    circulo.calcularArea();
                                } else {
                                    System.out.println("Cadastre um Circulo");
                                }
                                break;
                            case 3:
                                if (validaCadastroCirculo) {
                                    circulo.calcularPerimetro();
                                } else {
                                    System.out.println("Cadastre um Circulo");
                                }
                                break;
                            case 4:
                                System.out.println("Saindo do Circulo ...");
                                exitCirculo = true;
                                break;
                            default:
                                System.out.println("Escolha uma Opção Válida !");
                        }

                    }
                    break;
                case 2:
                    boolean exitRetangulo = false;

                    Retangulo retangulo = new Retangulo();

                    boolean validaCadastroRetangulo = false;


                    while (!exitRetangulo) {

                        System.out.println("--------------------\nRetangulo\n--------------------");
                        System.out.println("/* 1 - Cadastrar Retangulo*/");
                        System.out.println("/* 2 - Calcular Area      */");
                        System.out.println("/* 3 - definir quadrado   */");
                        System.out.println("/* 4 - Calcular Perimetro */");
                        System.out.println("/* 5 - Sair               */");

                        System.out.print("Informe a opção: ");

                        int optionRetangulo = scanner.nextInt();


                        switch (optionRetangulo) {
                            case 1:
                                validaCadastroRetangulo = retangulo.cadastrarRetangulo();
                                break;
                            case 2:
                                if (validaCadastroRetangulo) {
                                    retangulo.calcularArea();
                                } else {
                                    System.out.println("Cadastre um retangulo");
                                }
                                break;
                            case 3:
                                if (validaCadastroRetangulo) {
                                    retangulo.definirQuadrado();
                                } else {
                                    System.out.println("Cadastre um retangulo");
                                }
                                break;
                            case 4:
                                if (validaCadastroRetangulo) {
                                    retangulo.calcularPerimetro();
                                } else {
                                    System.out.println("Cadastre um retângulo");
                                }
                                break;

                            case 5:
                                System.out.println("Saindo do Retangulo ...");
                                exitRetangulo = true;
                                break;
                            default:
                                System.out.println("Escolha uma Opção Válida !");
                        }

                    }
                    break;
                case 3:
                    boolean exitTriangulo = false;

                    Triangulo triangulo = new Triangulo();

                    boolean validaCadastroTriangulo = false;


                    while (!exitTriangulo) {

                        System.out.println("--------------------\nTriângulo\n--------------------");
                        System.out.println("/* 1 - Cadastrar triângulo           */");
                        System.out.println("/* 2 - Tipo triângulo                */");
                        System.out.println("/* 3 - definir triângulo retangulo   */");
                        System.out.println("/* 4 - definir triângulo 345         */");
                        System.out.println("/* 5 - Sair                          */");

                        System.out.print("Informe a opção: ");

                        int optionTriangulo = scanner.nextInt();


                        switch (optionTriangulo) {
                            case 1:
                                validaCadastroTriangulo = triangulo.cadastrarTriangulo();
                                break;
                            case 2:
                                if (validaCadastroTriangulo) {
                                    triangulo.validarTriangulo();
                                } else {
                                    System.out.println("Cadastre um triângulo");
                                }
                                break;
                            case 3:
                                if (validaCadastroTriangulo) {
                                    triangulo.validarTrianguloRetangulo();
                                } else {
                                    System.out.println("Cadastre um triângulo");
                                }
                                break;
                            case 4:
                                if (validaCadastroTriangulo) {
                                    triangulo.validarTriangulo345();
                                } else {
                                    System.out.println("Cadastre um triângulo");
                                }
                                break;

                            case 5:
                                System.out.println("Saindo do triângulo ...");
                                exitTriangulo = true;
                                break;
                            default:
                                System.out.println("Escolha uma Opção Válida !");
                        }

                    }
                    break;
                case 4:
                    System.out.println("Escolheu 4");
                    exit = true;
                    break;
                default:
                    System.out.println("Escolha uma Opção Válida");

            }

        }

    }

}
