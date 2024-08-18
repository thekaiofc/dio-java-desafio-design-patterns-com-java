package subsistema2.cep;

public class CepApi {

	private static CepApi instancia;

	public CepApi() {
		super();
	}
	
	public static CepApi getInstancia() {
		return instancia;		
	}
	public String recuperarCidade(String cep) {
		return "Araraquara";
	}
	public String recuperarEstado(String cep) {
		return "São Paulo";
	}
}

