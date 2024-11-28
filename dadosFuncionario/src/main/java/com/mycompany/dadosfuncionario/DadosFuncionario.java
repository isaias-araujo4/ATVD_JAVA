package com.mycompany.dadosfuncionario;

import entidades.funcionario;
import entidades.funcionarioTercerizado;
import java.util.Locale;
import java.util.Scanner;

public class DadosFuncionario {

    public static void main(String[] args) {

        Locale brasil = new Locale("pt", "BR");
        Scanner sc = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("Deseja adicionar um funcionario da casa ou tercerizado: ");
            System.out.println("Casa(1)");
            System.out.println("Tercerizado(2)");
            System.out.println("Sair(3)");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do funcionario: ");
                    String nome = sc.next();

                    System.out.println("Digite as horas trabalhadas: ");
                    double horasTrabalhadas = sc.nextDouble();

                    System.out.println("Digite o valor por hora: ");
                    double valorPorHora = sc.nextDouble();

                    funcionario funcionario = new funcionario(nome, (int) horasTrabalhadas, valorPorHora);
                    System.out.println(funcionario);
                    break;

                case 2:
                    System.out.println("Digite o nome do funcionario: ");
                    nome = sc.next();

                    System.out.println("Digite as horas trabalhadas: ");
                    horasTrabalhadas = sc.nextDouble();

                    System.out.println("Digite o valor por hora: ");
                    valorPorHora = sc.nextDouble();

                    System.out.println("Digite as despesas adicionais:");
                    double despesasAdicionais = sc.nextDouble();

                    funcionarioTercerizado funcionarioTercerizado = new funcionarioTercerizado(nome, (int) horasTrabalhadas, valorPorHora, despesasAdicionais);
                    System.out.println(funcionarioTercerizado);
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao !=3);

        sc.close();
    }
}
