/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import modelo.DatosUDP;
import vista.ChatUDP;

/**
 *
 * @author Labs-DECC
 */
public class Servidor {

    private DatagramSocket socketServidor;
    private DatagramPacket paquete;
    private byte[] mensaje;
    private int puerto;


    Servidor(int puerto) {
        try {
            this.puerto=puerto;
            mensaje = new byte[1024];
        } catch (Exception e) {
        }
    }
    public DatosUDP recibirUDP() {
        DatosUDP aux = new DatosUDP();
        try {
            this.socketServidor = new DatagramSocket(puerto);
            paquete = new DatagramPacket(mensaje, mensaje.length);
            System.out.println("Servidor en espera...");
            socketServidor.receive(paquete);
            aux.setIP(paquete.getAddress().toString());
            aux.setMensaje(new String(paquete.getData()).substring(0, paquete.getLength()));
            System.out.println("SERVIDOR");
            System.out.println("Ip: "+aux.getIP());
            System.out.println("Mensaje: "+aux.getMensaje());
            socketServidor.close();
        } catch (Exception e) {
        }
        return aux;
    }
}