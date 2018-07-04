/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Labs-DECC
 */
public class Servidor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //servidor necesita server sockets
        InputStream FlujoEntrada ;
        DataInputStream Flujo ;
        
        try {
            
            ServerSocket ServidorSocket = new ServerSocket(2000);
            System.out.println("En Espera");
            Socket SocketRecibido = ServidorSocket.accept();
            System.out.println("Socket recibido");
            FlujoEntrada=SocketRecibido.getInputStream();
            Flujo= new DataInputStream(FlujoEntrada);
            //YA SE PUEDE TTRABAJAR
            System.out.println("Info EN > "+Flujo.readLine()); 
            ServidorSocket.close();
            System.out.println("IP Origen > "+SocketRecibido.getInetAddress());
            System.out.println("Puerto Origen > "+SocketRecibido.getPort());            
        } catch (IOException e) {
            System.out.println("ERROR"+e);
        }
        
        
        
    }
    
}
