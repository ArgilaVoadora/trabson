//Repositório: https://github.com/ArgilaVoadora/trabson.git
package trabsonprog;

import model.Computador;
/**
 *
 * @author joaovitor, jadielsantos, matheussoares
 */
public class TrabsonProg {

    public static void main(String[] args) {
        Computador comp = new Computador(1, 3, 3);
        System.out.println(comp.getPortaSerial().subList(0, 3));
        System.out.println(comp.getPortaUsb().subList(0, 3));
    }
    
}
