package br.com.alura.rh.service;

import br.com.alura.rh.model.FuncionarioRefatorado;

import java.math.BigDecimal;

public interface ValidacaoReajuste {
    void validar(FuncionarioRefatorado funcionario, BigDecimal aumento);
}
