/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.panaderialaabuela;

/**
 *
 * @author Enrique
 */
// Uso del patron estructural decorator
// Creamos las clases que rellenaran las hijas
public abstract class Bolsa {
    String descripcion="";
    
    public String getdescripcion(){
        return descripcion;
    }
    
    public abstract double precio();
}