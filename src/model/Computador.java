package model;

import java.util.ArrayList;
/**
 *
 * @author joaovitor, jadielsantos, matheussoares
 */
public final class Computador {
    private int id;
    private ArrayList<PortUsb> portaUsb = new ArrayList<>();
    private ArrayList<PortSerr> portaSerial = new ArrayList<>();

    public Computador(int id) {
        this.setId(id);
    }
    
    public void createPortUsb(int num){
        if (num != 0){
            for (int i = 0; i < num; i++) {
                PortUsb usb = new PortUsb(i, "Usb" + i);
                portaUsb.add(usb);
            }
        }
    }
    
    public void createPortSerr(int num){
        if (num != 0){
            for (int i = 0; i < num; i++) {
                PortSerr serial = new PortSerr("Serial" + i);
                portaSerial.add(serial);
            }
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<PortUsb> getPortaUsb() {
        return portaUsb;
    }

    public void setPortaUsb(ArrayList<PortUsb> portaUsb) {
        this.portaUsb = portaUsb;
    }

    public ArrayList<PortSerr> getPortaSerial() {
        return portaSerial;
    }

    public void setPortaSerial(ArrayList<PortSerr> portaSerial) {
        this.portaSerial = portaSerial;
    }
    
    
}
