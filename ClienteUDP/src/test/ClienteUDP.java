package test;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dell
 */
public class ClienteUDP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            DatagramSocket socketCliente=new DatagramSocket();
            String mensaje="Prueba UDP";
            byte [] aux=mensaje.getBytes();
            DatagramPacket paquete=new DatagramPacket(aux, aux.length,
                    InetAddress.getByName("localhost"),4000);
            socketCliente.send(paquete);
            System.out.println("Mensaje enviado");
            System.out.println("Destino: "+paquete.getAddress());
            socketCliente.close();
        } catch (Exception e) {
        }
    }
    
}
