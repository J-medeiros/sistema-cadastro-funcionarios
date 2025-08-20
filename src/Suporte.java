public class Suporte extends Funcionario {
    public Suporte(String nome, int idade, int horasSemana, double valorHora) {
        super(nome, "Suporte", idade, horasSemana, valorHora);
    }

    @Override
    public double calcularSalarioBase() {
        return getHorasSemana() * getValorHora() * 2;
    }

    @Override
    public double calcularComissao() {
        double base = calcularSalarioBase();
        return base * 0.05;
    }
}
