public class Main {
    public static void main(String[] args) {
        Funcionario gerente = new Gerente("Carlos", 45, 40, 50);
        Funcionario programador = new Programador("Ana", 28, 35, 40);
        Funcionario analista = new Analista("João", 32, 30, 45);
        Funcionario suporte = new Suporte("Marcos", 25, 20, 30);

        Funcionario[] funcionarios = { gerente, programador, analista, suporte };

        for (Funcionario f : funcionarios) {
            System.out.println("=================================");
            System.out.println("Nome: " + f.getNome());
            System.out.println("Idade: " + f.getIdade());
            System.out.println("Setor: " + f.getSetor());
            System.out.println("Horas Semanais: " + f.getHorasSemana());
            System.out.println("Valor por Hora: R$ " + f.getValorHora());
            System.out.println("Salário Base: R$ " + f.calcularSalarioBase());
            System.out.println("Comissão: R$ " + f.calcularComissao());
            System.out.println("Salário Final: R$ " + f.calcularSalarioFinal());
        }
    }
}
