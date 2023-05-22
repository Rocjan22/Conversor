/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conversor;

import controlador.CONTROLADOR;
import modelo.MODELO;
import vista.VISTA;

/**
 *
 * @author WINDOWS
 */
public class Conversor {

    public static void main(String[] args) {
        MODELO mod = new MODELO();
        VISTA view = new VISTA();
        
        CONTROLADOR ctrl = new CONTROLADOR(view, mod);
        
        ctrl.iniciar();
        view.setVisible(true);
        
    }
}
