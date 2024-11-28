/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atvdestoque;

//feito por isaias e samuel

import entidades.Produto;
import java.util.Locale;
import java.util.Scanner;

public class AtvdEstoque {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("digite o nome do produto: ");
        String nome = sc.next();

        System.out.println("digite o preço do produto: ");
        double preco = sc.nextDouble();

        System.out.println("digite a quantidade em estoque do produto: ");
        int quantidade = sc.nextInt();
        Produto produto = new Produto(nome, preco, quantidade);

        int opcao;
        do {
            System.out.println(produto);
            System.out.println("digite 1 para ver o valor total");
            System.out.println("digite 2 para adicionar ao estoque");
            System.out.println("digite 3 para remover do estoque");
            System.out.println("digite 4 para sair");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("valor total em estoque: " + produto.valorTotal());
                    break;

                case 2:
                    System.out.println("digite a quantia para adicionar ao estoque: ");
                    int addQuantia = sc.nextInt();
                    produto.addProduto(addQuantia);
                    break;

                case 3:
                    System.out.println("digite a quantia para remover do estoque: ");
                    int remvQuantia = sc.nextInt();
                    produto.remvProduto(remvQuantia);
                    break;
            }
        } while (opcao != 4);

    }

}
