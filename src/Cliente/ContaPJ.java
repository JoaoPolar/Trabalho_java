package Cliente;

public class ContaPJ extends Cliente {
    
    private int CNPJ;
    
    public int getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(int CNPJ) {
        this.CNPJ = CNPJ;
    }
    
    public ContaPJ(int id, String nome, String tipo, int CNPJ) {
        super (id, tipo, nome);
        this.CNPJ = CNPJ;
    }
    
}
