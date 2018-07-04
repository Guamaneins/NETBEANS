/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.net.DatagramPacket;

/**
 *
 * @author Labs-DECC
 */
public class DatosUDP {
        private String IP;
        private String Mensaje; 

    public DatosUDP() {
        this.IP = "0.0.0.0";
        this.Mensaje = "vacio";
    }

        
    public String getIP() {
        return IP;
    }

    public void setIP(String IP) {
        this.IP = IP;
    }

    public String getMensaje() {
        return Mensaje;
    }

    public void setMensaje(String Mensaje) {
        this.Mensaje = Mensaje;
    }
        
        
}
