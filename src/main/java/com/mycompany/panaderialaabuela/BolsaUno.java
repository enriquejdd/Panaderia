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
public class BolsaUno extends Bolsa{
    // Descripcion con los productos que contiene la bolsa //
    public BolsaUno(){
        descripcion="Bolsita de chucherías, red bull, coca-cola, 2 barras de pan, botella de \n" +
        "oxígeno activo, lays sabor campesinas, botella de monster";
    }
    
    // Metodo sobrecargado de la clase padre la cual devuelve el precio de la bolsa //
    @Override
    public double precio(){
        return 14.2;
    }
}
