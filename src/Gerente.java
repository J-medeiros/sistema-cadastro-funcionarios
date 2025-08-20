public class Gerente extends Funcionario {
    public Gerente(String nome, int idade, int horasSemana, double valorHora) {
        super(nome, "Gerência", idade, horasSemana, valorHora);
    }

    @Override
    public double calcularSalarioBase() {
        return getHorasSemana() * getValorHora() * 5.8;
    }

    @Override
    public double calcularComissao() {
        double base = calcularSalarioBase();
        return (base * 0.30) + (base * 0.15) + (base * 0.05);
    }
}
