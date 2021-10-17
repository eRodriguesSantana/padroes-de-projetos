package one.digitalinnovation.gof.facade.subsistema2.cep;

public class CepApi {

	private static CepApi instance = new CepApi();
	
	private CepApi() {
		super();
	}
	
	public static CepApi getInstance() {
		return instance;
	}
	
	public String recuperarCidade(String cep) {
		return "Barueri";
	}
	
	public String recuperarEstado(String cep) {
		return "S�o Paulo";
	}
}
