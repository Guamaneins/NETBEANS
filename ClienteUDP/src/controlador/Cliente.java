/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Cliente {
    private DatagramSocket socketCliente;
    private byte[] aux;
    private DatagramPacket paquete;
    public Cliente() {
        try {
            this.socketCliente = new DatagramSocket();
        } catch (Exception e) {
        }
    }
    public void enviarUDP(String mensaje, String host, int puerto) {
        try {
            socketCliente = new DatagramSocket();
            byte[] aux = mensaje.getBytes();
            paquete = new DatagramPacket(aux, aux.length, InetAddress.getByName(host), puerto);
            System.out.println("CLIENTE");
            System.out.println("Mensaje enviado");
            System.out.println("Destino: " + paquete.getAddress());
            System.out.println("Mensaje a enviar: "+new String(paquete.getData()).substring(0, paquete.getLength()));
            socketCliente.send(paquete);
            socketCliente.close();
        } catch (Exception e) {
        }
    }
}
