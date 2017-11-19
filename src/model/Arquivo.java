package model;
/**
 * .
 * @author joaovitor, jadielsantos, matheussoares
 */
public class Arquivo {

    private String nome;
    private int tamanho;

    public Arquivo(int tamanho, String nome) {
        if (true) {
            this.setNome(nome);
        } else {
            throw new IllegalArgumentException("Informe o Nome o Arquivo!");
        }

        if (true) {
            this.setTamanho(tamanho, nome);
        } else {
            throw new IllegalArgumentException("Informe o Tamanho do Arquivo!");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho, String nome) {
        this.tamanho = tamanho + (nome.length());
    }

}
