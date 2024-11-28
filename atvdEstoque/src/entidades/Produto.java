/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

//feito por isaias e samuel

public class Produto {

    private String nome;
    private double preco;
    private int quantidade;

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    
    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    
    
    public double valorTotal(){
       return quantidade * preco;
    }
    
    public void addProduto(int quantia) {
        this.quantidade += quantia;
    }

    public void remvProduto(int quantia) {
        this.quantidade -= quantia;
    }

    public String toString(){
        return "nome: "
                + nome 
                + ", preço: " 
                + String.format("%.2f", preco) 
                + ", quantidade: " + quantidade 
                + ", valor total em estoque: " 
                + valorTotal();
    
    }
    
}
