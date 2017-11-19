package model;
/**
 * .
 * @author joaovitor, jadielsantos, matheussoares
 */
public class LeitoraDVD extends Periferico{
    private String nome;
    private MidiaCD mcd;
    private MidiaDVD mdvd;

    public LeitoraDVD(String nome, int tamanho) {
        super(tamanho);
        this.nome = nome;
    }
    
    public void inserirMidiaCD(MidiaCD mcd){
        this.setMcd(mcd);
    }
    
    public void inserirMidiaDVD(MidiaDVD mdvd){
        this.setMdvd(mdvd);
    }
    
    public void removerMidiaCD(){
        this.mcd = null;
    }
    
    public void removerMidiaDVD(){
        this.mdvd = null;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public MidiaCD getMcd() {
        return mcd;
    }

    public void setMcd(MidiaCD mcd) {
        this.mcd = mcd;
    }

    public MidiaDVD getMdvd() {
        return mdvd;
    }

    public void setMdvd(MidiaDVD mdvd) {
        this.mdvd = mdvd;
    }
    
    
}
