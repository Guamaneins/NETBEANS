/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.DatosUDP;
import vista.ChatUDP;

/**
 *
 * @author Labs-DECC
 */
public class HiloServidor extends Thread {

    private Servidor servidor;
    private ChatUDP aThis;
    private DatosUDP aux;
    private int bandera;

    public HiloServidor(int puerto, ChatUDP aThis) {
        this.servidor = new Servidor(puerto);
        this.aThis= aThis;
        bandera =1;
    }

    @Override
    public void run() {
        while (true) {
            aux = servidor.recibirUDP();
            aThis.getTxtArea().setText(aux.getIP() + " : " + aux.getMensaje());
    
            
            
        }
    }

}
