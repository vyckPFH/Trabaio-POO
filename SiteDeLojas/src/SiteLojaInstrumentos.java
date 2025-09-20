import java.util.LinkedList;

public class SiteLojaInstrumentos {
    private LinkedList<Loja> lojas;
    private Cliente cliente;

    // Construtor padrão
    public SiteLojaInstrumentos() {
        this.lojas = new LinkedList<>();
    }

    // Construtor com parâmetros
    public SiteLojaInstrumentos(LinkedList<Loja> lojas, Cliente cliente) {
        this.lojas = lojas;
        this.cliente = cliente;
    }

    // Getters e Setters
    public LinkedList<Loja> getLojas() {
        return lojas;
    }

    public void setLojas(LinkedList<Loja> lojas) {
        this.lojas = lojas;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
