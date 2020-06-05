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
public class BolsaCuatro extends Bolsa{
    // Descripcion con los productos que contiene la bolsa //
    public BolsaCuatro(){
        descripcion="Pack de latas de coca-cola, bolsita de chucherías, red bull, coca-cola, \n" +
        "2 barras de pan, botella de oxígeno activo, lays sabor campesinas";
    }
    
    // Metodo sobrecargado de la clase padre la cual devuelve el precio de la bolsa //
    @Override
    public double precio(){
        return 10.2;
    }
}
