package subsistema2;

public class CepApi {
    
    private static CepApi instancia = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstancia() {
        return instancia;
    }

    public void recuperarCidade(String cep){
        return "Araraquara";
    }

    public void recuperarEstado(String cep){
        return "SP";
    }
}