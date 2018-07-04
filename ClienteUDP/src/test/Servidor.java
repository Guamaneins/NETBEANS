/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;


import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 *
 * @author Labs-DECC
 */
public class Servidor {

    public static void main(String[] args) {
        // TODO code application logic here
        try {
            DatagramSocket socketServidor = new DatagramSocket(4000);
            byte[] mensaje = new byte[1024];
            DatagramPacket paquete = new DatagramPacket(mensaje, mensaje.length);
            System.out.println("Servidor en espera...");
            socketServidor.receive(paquete);
            String aux = new String(paquete.getData()).substring(0, paquete.getLength());
            System.out.println("Mensaje: " + aux);
            System.out.println("Origen: " + paquete.getAddress());
            socketServidor.close();
        } catch (Exception e) {
        }

    }
}
