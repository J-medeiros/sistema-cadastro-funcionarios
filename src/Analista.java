public class Analista extends Funcionario {
    public Analista(String nome, int idade, int horasSemana, double valorHora) {
        super(nome, "Análise", idade, horasSemana, valorHora);
    }

    @Override
    public double calcularSalarioBase() {
        return getHorasSemana() * getValorHora() * 3.1;
    }

    @Override
    public double calcularComissao() {
        double base = calcularSalarioBase();
        return (base * 0.10) + (base * 0.05);
    }
}
