/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

//assinado: isaias araujo
public class contaEspecial extends conta {

    private double limiteEmprestimo;

    public contaEspecial(int numero, String titular, double depInicial, double limiteEmprestimo) {
        super(numero, titular, depInicial);
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public contaEspecial(int numero, String titular, double limiteEmprestimo) {
        super(numero, titular);
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public double getLimiteEmprestimo() {
        return limiteEmprestimo;
    }

    public void setLimiteEmprestimo(double limiteEmprestimo) {
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public void realizarEmprestimo(double quantia) {
        if (quantia <= limiteEmprestimo) {
            deposito(quantia);
            limiteEmprestimo -= quantia;
            System.out.println("Empréstimo realizado com sucesso.");
        } else {
            System.out.println("Valor ultrapassa o limite de empréstimo.");
        }
    }

    public String toString() {
        return super.toString() + ", Limite de Empréstimo: R$ " + String.format("%.2f", limiteEmprestimo);
    }

}
