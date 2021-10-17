package one.digitalinnovation.gof.java_puro.facade;

import one.digitalinnovation.gof.java_puro.facade.subsistema1.crm.CrmService;
import one.digitalinnovation.gof.java_puro.facade.subsistema2.cep.CepApi;

public class Facade {

	public void migrarCliente(String nome, String cep) {
		String cidade = CepApi.getInstance().recuperarCidade(cep);
		String estado = CepApi.getInstance().recuperarEstado(cep);
		CrmService.gravarCliente(nome, cep, cidade, estado);
	}
}
