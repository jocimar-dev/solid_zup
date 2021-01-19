package br.com.zup.rh.service.reajuste;

import java.math.BigDecimal;

import br.com.zup.rh.model.Funcionario;

public interface ValidacaoReajuste {
	
	void validar(Funcionario funcionario, BigDecimal aumento);

}
