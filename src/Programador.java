public class Programador extends Funcionario {
    public Programador(String nome, int idade, int horasSemana, double valorHora) {
        super(nome, "Programação", idade, horasSemana, valorHora);
    }

    @Override
    public double calcularSalarioBase() {
        return getHorasSemana() * getValorHora() * 4.2;
    }

    @Override
    public double calcularComissao() {
        double base = calcularSalarioBase();
        return (base * 0.20) + (base * 0.10);
    }
}
