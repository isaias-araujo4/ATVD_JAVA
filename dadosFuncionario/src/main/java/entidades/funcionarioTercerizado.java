package entidades;

public class funcionarioTercerizado extends funcionario {

    public double despesasAdicionais;

    public funcionarioTercerizado(String nome, int horasTrabalhadas, double valorPorHora, double despesasAdicionais) {
        super(nome, horasTrabalhadas, valorPorHora);
        this.despesasAdicionais = despesasAdicionais;
    }

    public double getDespesasAdicionais() {
        return despesasAdicionais;
    }

    public double calcularBonus() {
        return despesasAdicionais * 1.10;
    }

    public double calcularPagamentoTercerizado() {
        return Pagamento() + calcularBonus();
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Pagamento: " + String.format("%.2f", calcularPagamentoTercerizado());
    }
}