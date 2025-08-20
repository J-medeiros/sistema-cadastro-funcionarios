# 📌 Sistema de Cadastro de Funcionários

Este projeto implementa um **sistema de cadastro de funcionários** em
uma empresa, utilizando os princípios da **Programação Orientada a
Objetos (POO)** em **Java**.

O sistema permite cadastrar diferentes tipos de funcionários (**Gerente,
Programador, Analista e Suporte**), cada um com suas próprias regras de
cálculo de salário e comissão, aplicando **abstração, herança e
polimorfismo**.

------------------------------------------------------------------------

## 🔹 Estrutura do Projeto

-   **Classe Abstrata:** `Funcionario`
    -   Atributos: `nome`, `idade`, `setor`, `horasSemana`, `valorHora`\
    -   Métodos abstratos: `calcularSalarioBase()` e
        `calcularComissao()`\
    -   Métodos concretos: construtor, getters, setters e
        `calcularSalarioFinal()`.
-   **Subclasses:**
    -   `Gerente`\
    -   `Programador`\
    -   `Analista`\
    -   `Suporte`\
        \> Cada classe sobrescreve os métodos de cálculo de acordo com
        suas regras específicas.
-   **Classe Principal:** `Principal`
    -   Responsável por instanciar os objetos, cadastrar os funcionários
        e exibir suas informações.

------------------------------------------------------------------------

## 🔹 Regras de Cálculo

-   **Gerente**
    -   Salário Base: `horasSemana * valorHora * 5.8`\
    -   Comissão: `30% salário base + 15% bonificação + 5% benefícios`
-   **Programador**
    -   Salário Base: `horasSemana * valorHora * 4.2`\
    -   Comissão: `20% salário base + 10% bonificação`
-   **Analista**
    -   Salário Base: `horasSemana * valorHora * 3.1`\
    -   Comissão: `10% salário base + 5% benefícios`
-   **Suporte**
    -   Salário Base: `horasSemana * valorHora * 2`\
    -   Comissão: `5% benefícios`

------------------------------------------------------------------------

## 🔹 Funcionalidades

✅ Cadastro de funcionários de diferentes setores\
✅ Cálculo automático de **salário base, comissão e salário final**\
✅ Exibição detalhada das informações de cada funcionário:\
- Nome\
- Idade\
- Setor\
- Horas semanais\
- Valor por hora\
- Salário base\
- Comissão\
- Salário final

------------------------------------------------------------------------

## 🔹 Exemplo de Saída

    =================================
    Nome: Carlos
    Idade: 45
    Setor: Gerência
    Horas Semanais: 40
    Valor por Hora: R$ 50.0
    Salário Base: R$ 11600.0
    Comissão: R$ 5800.0
    Salário Final: R$ 17400.0

------------------------------------------------------------------------

## 🔹 Como Executar

1.  Clone o repositório:\

``` bash
git clone https://github.com/seu-usuario/cadastro-funcionarios.git
```

2.  Acesse a pasta do projeto:\

``` bash
cd cadastro-funcionarios/src
```

3.  Compile os arquivos:\

``` bash
javac *.java
```

4.  Execute o programa:\

``` bash
java Principal
```

------------------------------------------------------------------------

## 🛠️ Tecnologias Utilizadas

-   **Java 17+**\
-   **POO (Abstração, Herança e Polimorfismo)**

------------------------------------------------------------------------

## 👨‍💻 Autor

Projeto desenvolvido por **\[Seu Nome\]** ✨
