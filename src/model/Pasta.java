package model;
/**
 * .
 * @author joaovitor, jadielsantos, matheussoares
 */
import java.util.ArrayList;

public class Pasta {
    private int tamanho;
    private String nome;

    public Pasta(String nome) {
        if (nome != null) {
            this.setNome(nome);
        } else {
            throw new IllegalArgumentException("Informe o Nome da Pasta!");
        }
        setTamanho(nome);
    }
    
    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(String nome) {
        tamanho = 8 + (nome.length());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
