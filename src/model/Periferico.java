//Repositório: https://github.com/ArgilaVoadora/trabson.git
package model;
/**
 * .
 * @author joaovitor, jadielsantos, matheussoares
 */
public abstract class Periferico {
    private int tamanho;
    private boolean status = false;

    public Periferico(int tamanho) {
        if (tamanho != 0) {
            this.setTamanho(tamanho);
        } else {
            throw new IllegalArgumentException("Informe o Tamanho do Periférico!");
        }

        this.status = true;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
}
