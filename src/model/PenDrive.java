package model;

import java.util.ArrayList;
/**
 * .
 * @author joaovitor, jadielsantos, matheussoares
 */
public class PenDrive extends Periferico {
    private String nome;
    private ArrayList<Arquivo> arquivos = new ArrayList<>();
    private ArrayList<Pasta> pastas = new ArrayList<>();
    
    public PenDrive(String tipo, int tamanho) {
        super(tamanho);
        this.setNome(nome);
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
        int capacidade = this.getTamanho();
        for (Arquivo arq : arquivos) {
            capacidade -= arq.getTamanho();
        }
        
        for (Pasta pst : pastas) {
            capacidade -= pst.getTamanho();
        }
        
        return capacidade;
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
    
}
