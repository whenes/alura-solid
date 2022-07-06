package br.com.alura.rh.service;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.FuncionarioRefatorado;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class ReajusteService {
    private List<ValidacaoReajuste> validacoes;
    public ReajusteService(List<ValidacaoReajuste> validacoes) {
        this.validacoes = validacoes;
    }
    public void reajustarSalarioDoFuncionario(FuncionarioRefatorado funcionario, BigDecimal aumento) {
        this.validacoes.forEach(validacao -> validacao.validar(funcionario, aumento));
        BigDecimal salarioReajustado = funcionario.getSalario().add(aumento);
        funcionario.atualizarSalario(salarioReajustado);
    }
}
