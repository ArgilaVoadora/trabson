package model;
/**
 * .
 * @author joaovitor, jadielsantos, matheussoares
 */
public class LeitoraCD extends Periferico {
    private String nome;
    private MidiaCD mcd;

    public LeitoraCD(int tamanho) {
        super(tamanho);
        this.setNome(nome);
    }
    
    public void inserirMidia(MidiaCD mcd){
        this.setMcd(mcd);
    }
    
    public void removerMidia(){
        this.mcd = null;
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
    
}
