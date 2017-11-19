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

    public void createPortUsb(int num) {
        if (num != 0) {
            if (portaUsb.size() == 0) {
                for (int i = 0; i < num; i++) {
                    PortUsb usb = new PortUsb(i, "Usb" + i);
                    portaUsb.add(usb);
                }
            } else {
                for (int i = 0; i < num; i++) {
                    PortUsb usb = new PortUsb(i, "Usb" + portaUsb.size());
                    portaUsb.add(usb);
                }
            }
        }
    }

    public void createPortSerr(int num) {
        if (num != 0) {
            if (portaSerial.size() == 0) {
                for (int i = 0; i < num; i++) {
                    PortSerr pserr = new PortSerr(i, "Serial" + i);
                    portaSerial.add(pserr);
                }
            } else {
                for (int i = 0; i < num; i++) {
                    PortSerr pserr = new PortSerr(i, "Serial" + portaSerial.size());
                    portaSerial.add(pserr);
                }
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
