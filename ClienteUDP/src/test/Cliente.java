/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
public class Cliente {
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            DatagramSocket socketCliente = new DatagramSocket();
            String mensaje = "Prueba UDP";
            byte[] aux = mensaje.getBytes();
            DatagramPacket paquete = new DatagramPacket(aux, aux.length,
                    InetAddress.getByName("localhost"), 4000);
            socketCliente.send(paquete);
            System.out.println("Mensaje enviado");
            System.out.println("Destino: "+paquete.getAddress());
            socketCliente.close();
        } catch (Exception e) {
        }
    }
}
