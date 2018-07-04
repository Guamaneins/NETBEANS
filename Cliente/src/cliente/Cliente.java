/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;


import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 *
 * @author Labs-DECC
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OutputStream FlujoSalida;
        DataOutputStream Flujo ;
        
        try {
            Socket ClienteSocket= new Socket("10.9.7.212", 2000);
            FlujoSalida = ClienteSocket.getOutputStream();
            Flujo = new DataOutputStream(FlujoSalida);
            Flujo.writeBytes("HOLA SOY UN CLIENTE");
            ClienteSocket.close();
            
        } catch (Exception e) {
            System.out.println("Error"+e);
        }
    }
    
}
