package com.practical.test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

// 2 - Classe Funcionário que estenda a classe Pessoa, com os atributos: salário (BigDecimal) e função (String)
public class Funcionario extends Pessoa {
    private BigDecimal salario;
    private final String funcao;

    public Funcionario(String nome, LocalDate dataNascimento, BigDecimal salario, String funcao) {
        super(nome, dataNascimento);
        this.salario = salario;
        this.funcao = funcao;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public String getFuncao() {
        return funcao;
    }

    // 3.3 - A informação de data deve ser exibido no formato dd/mm/aaaa e a informação de valor numérico deve ser exibida no formatado com separador de milhar como ponto e decimal como vírgula.
    @Override
    public String toString() {
        return String.format("%s, %s, %s, %s",
                getNome(),
                getDataNascimento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                String.format("%,.2f", salario),
                funcao);
    }
}
