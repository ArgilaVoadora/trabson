package model;

/**
 *
 * @author joaovitor, jadielsantos, matheussoares
 */
public class PortUsb {
    private int id;
    private String nome;
    private Periferico PF;
    
    public PortUsb(int id, String nome) {
        this.setId(id);
        this.setNome(nome);
    }
    
    public void conectar(Periferico PF){
        this.PF = PF;
    }

    public void desconectar(){
       this.PF = null;
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
