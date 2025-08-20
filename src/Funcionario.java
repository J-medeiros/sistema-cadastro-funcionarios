public abstract class Funcionario {
    private String nome;
    private String setor;
    private int idade;
    private int horasSemana;
    private double valorHora;

    public Funcionario(String nome, String setor, int idade, int horasSemana, double valorHora) {
        this.nome = nome;
        this.setor = setor;
        this.idade = idade;
        this.horasSemana = horasSemana;
        this.valorHora = valorHora;
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public String getSetor() { return setor; }
    public int getIdade() { return idade; }
    public int getHorasSemana() { return horasSemana; }
    public double getValorHora() { return valorHora; }

    public void setNome(String nome) { this.nome = nome; }
    public void setSetor(String setor) { this.setor = setor; }
    public void setIdade(int idade) { this.idade = idade; }
    public void setHorasSemana(int horasSemana) { this.horasSemana = horasSemana; }
    public void setValorHora(double valorHora) { this.valorHora = valorHora; }

    // Métodos abstratos
    public abstract double calcularSalarioBase();
    public abstract double calcularComissao();

    // Salário final = base + comissão
    public double calcularSalarioFinal() {
        return calcularSalarioBase() + calcularComissao();
    }
}
