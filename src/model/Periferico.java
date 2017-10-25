//Repositório: https://github.com/ArgilaVoadora/trabson.git
package model;
/**
 *.
 * @author joaovitor, jadielsantos, matheussoares
 */
public class Periferico {
    private int id = 0;
    private int bytes;
    private boolean status;
    private String tipo;

    public Periferico(int id, String tipo, int bytes, boolean status) {
        this.setId(id);
        this.setBytes(bytes);
        this.setStatus(status);
        this.setTipo(tipo);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBytes() {
        return bytes;
    }

    public void setBytes(int bytes) {
        this.bytes = bytes;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
