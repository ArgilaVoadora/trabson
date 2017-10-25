package model;

/**
 *
 * @author joaovitor, jadielsantos, matheussoares
 */
public class PortUsb {
    private int id;
    private String nome;
    private PenDrive PD;
    private HDExterno DH;
    
    public PortUsb(int id, String nome) {
        this.setId(id);
        this.setNome(nome);
    }
    
    public void conectar(PenDrive PD){
        this.PD = PD;
    }

    public void desconectar(){
       this.PD = null;
    }
            
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
