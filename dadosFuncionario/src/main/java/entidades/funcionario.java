package entidades;

public class funcionario {

    public String nome;
    public double horasTrabalhadas;
    public double valorPorHora;

    public funcionario(String nome, int horasTrabalhadas, double valorPorHora) {
        this.nome = nome;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorPorHora = valorPorHora;
    }

    public String getNome() {
        return nome;
    }

    public double getHoraTrabalhada() {
        return horasTrabalhadas;
    }

    public double getValorPorHora() {
        return valorPorHora;
    }

    public double Pagamento() {
        return horasTrabalhadas * valorPorHora;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Pagamento: " + String.format("%.2f", Pagamento());
    }
}