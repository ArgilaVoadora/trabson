package model;

import java.util.ArrayList;
/**
 * .
 * @author joaovitor, jadielsantos, matheussoares
 */
public class MidiaDVD {
    private String nome;
    private int tamanho;
    private ArrayList<Arquivo> arquivos = new ArrayList<>();
    private ArrayList<Pasta> pastas = new ArrayList<>();

    public MidiaDVD(String nome, int tamanho) {
        this.setNome(nome);
        this.setTamanho(tamanho);
    }
    
    public void adicionarArquivo(Arquivo arquivo){
        if (arquivo.getTamanho() < this.getCapacidadeRestante()) {
            this.arquivos.add(arquivo);
        }else{
            throw new IllegalArgumentException("O tamanho do arquivo excede a capacidade do dispositivo!");
        }
    }
    
    public void adicionarPata(Pasta pasta){
        if (pasta.getTamanho() < this.getCapacidadeRestante()) {
            this.pastas.add(pasta);
        }else{
            throw new IllegalArgumentException("O tamanho da pasta excede a capacidade do dispositivo!");
        }
    }
    
    public int getCapacidadeRestante(){
        int capacidade = this.tamanho;
        for (Arquivo arq : arquivos) {
            capacidade -= arq.getTamanho();
        }
        
        for (Pasta pst : pastas) {
            capacidade -= pst.getTamanho();
        }
        
        return capacidade;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Arquivo> getArquivos() {
        return arquivos;
    }

    public void setArquivos(ArrayList<Arquivo> arquivos) {
        this.arquivos = arquivos;
    }

    public ArrayList<Pasta> getPastas() {
        return pastas;
    }

    public void setPastas(ArrayList<Pasta> pastas) {
        this.pastas = pastas;
    }
    
    
}
