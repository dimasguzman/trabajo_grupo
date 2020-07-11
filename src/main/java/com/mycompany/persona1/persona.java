/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.persona1;

import informacion.Deportista;
import informacion.Doctor;

/**
 *
 * @author Dimas
 */
public class persona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Doctor dr=new Doctor ();
           Deportista da=new Deportista();
           
           System.out.println();
          dr.imprimir();
           System.out.println();
           da.imprimir();
           
    }

}
