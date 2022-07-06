package br.com.alura.rh.service.reajuste;

import br.com.alura.rh.model.FuncionarioRefatorado;

import java.math.BigDecimal;

public interface ValidacaoReajuste {
    void validar(FuncionarioRefatorado funcionario, BigDecimal aumento);
}
