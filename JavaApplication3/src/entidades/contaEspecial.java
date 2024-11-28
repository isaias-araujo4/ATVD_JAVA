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

    public void realizarEmprestimo(double quantia) {
        if (quantia <= limiteEmprestimo) {
            deposito(quantia);
            limiteEmprestimo -= quantia;
            saldo -= 10.0;
        } else {
            System.out.println("Empréstimo excede o limite disponível.");
        }
    }

    public double getLimiteEmprestimo() {
        return limiteEmprestimo;
    }

    public void setLimiteEmprestimo(double limiteEmprestimo) {
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public String toString() {
        return super.toString() + ", limite de empréstimo: R$ " + String.format("%.2f", limiteEmprestimo);
    }

}
