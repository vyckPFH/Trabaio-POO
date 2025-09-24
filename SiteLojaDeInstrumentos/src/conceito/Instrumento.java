package conceito;
public class Instrumento {
    private String nome;
    private String tipo;
    private float preco;
    private String cor;
    private int tamanho;
    private int quantidade;
    private int id;

    public Instrumento(String nome, String tipo, float preco, String cor, int tamanho, int quantidade, int id) {
        this.nome = nome;
        this.tipo = tipo;
        this.preco = preco;
        this.cor = cor;
        this.tamanho = tamanho;
        this.quantidade = quantidade;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Instrumento() {}

    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
}
