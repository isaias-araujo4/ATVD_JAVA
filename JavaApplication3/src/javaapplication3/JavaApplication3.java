/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package javaapplication3;

//assinado: isaias araujo

import entidades.conta;
import entidades.contaEspecial;
import java.util.Locale;
import java.util.Scanner;

public class JavaApplication3 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        conta conta = null;

        System.out.println("escolha 1 para conta normal");
        System.out.println("escolha 2 para conta especial");
        int tipoConta = sc.nextInt();

        if (tipoConta == 1) {
            System.out.println("informe o número da conta: ");
            int numero = sc.nextInt();

            System.out.println("informe o nome do titular da conta: ");
            String titular = sc.next();

            System.out.print("informe se tem deposito inicial (y/n)?: ");
            char resposta = sc.next().charAt(0);
            if (resposta == 'y') {
                System.out.print("informe um valor de deposito inicial: ");
                double depInicial = sc.nextDouble();
                conta = new conta(numero, titular, depInicial);
            } else {
                conta = new conta(numero, titular);
            }

            int opcao;
            do {
                System.out.println(conta);
                System.out.println("escolha 1 para fazer um deposito");
                System.out.println("escolha 2 para saque");
                System.out.println("escolha 3 para sair");
                opcao = sc.nextInt();
                switch (opcao) {
                    case 1: {
                        System.out.println("informe o valor do deposito: ");
                        double depositoValor = sc.nextDouble();
                        conta.deposito(depositoValor);
                        break;
                    }

                    case 2: {
                        System.out.println("informe o valor do saque: ");
                        double saqueValor = sc.nextDouble();
                        conta.saque(saqueValor);
                        break;
                    }

                    default:
                        System.out.println("opção invalida");
                }

            } while (opcao != 3);
        } else {
            System.out.println("informe o número da conta: ");
            int numero = sc.nextInt();

            System.out.println("informe o nome do titular da conta: ");
            String titular = sc.next();

            System.out.println("informe o valor do limite para emprestimo");
            double limiteEmprestimo = sc.nextDouble();

            System.out.print("informe se tem deposito inicial (y/n)?: ");
            char resposta = sc.next().charAt(0);
            if (resposta == 'y') {
                System.out.print("informe um valor de deposito inicial: ");
                double depInicial = sc.nextDouble();
                conta = new contaEspecial(numero, titular, depInicial, limiteEmprestimo);
            } else {
                conta = new contaEspecial(numero, titular, limiteEmprestimo);
            }

            int opcao;
            do {
                System.out.println(conta);
                System.out.println("escolha 1 para fazer um deposito");
                System.out.println("escolha 2 para saque");
                System.out.println("escolha 3 para emprestimo");
                System.out.println("escolha 4 para sair");
                opcao = sc.nextInt();
                switch (opcao) {
                    case 1: {
                        System.out.println("informe o valor do deposito: ");
                        double depositoValor = sc.nextDouble();
                        conta.deposito(depositoValor);
                        break;
                    }

                    case 2: {
                        System.out.println("informe o valor do saque: ");
                        double saqueValor = sc.nextDouble();
                        conta.saque(saqueValor);
                        break;
                    }

                    case 3: {
                        System.out.println("informe o valor para emprestimo");
                        double valorEmprestimo = sc.nextDouble();
                        if (valorEmprestimo > ((contaEspecial) conta).getLimiteEmprestimo()) {
                            System.out.println("valor utrapassa o limite");
                        } else {
                            ((contaEspecial) conta).realizarEmprestimo(valorEmprestimo);
                        }
                        break;
                    }

                }

            } while (opcao != 4);

        }

    }

}
