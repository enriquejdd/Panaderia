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
public class BolsaDos extends Bolsa{
    // Descripcion con los productos que contiene la bolsa //
    public BolsaDos(){
        descripcion="Bolsa de patatas fritas, pack de latas de coca-cola, bolsa de papa-delta, \n" +
        "gusanitos RISI, paquete de medianoches,";
    }
    
    // Metodo sobrecargado de la clase padre la cual devuelve el precio de la bolsa //
    @Override
    public double precio(){
        return 7.5;
    }
}
