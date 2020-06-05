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
public enum Productos {

    // Creamos un enum con todos los productos y sus precios //
    Monster(1, "Botella Monster", 4.0),
    Patatas(5, "Bolsa de patatas", 2.0),
    CocaColaLata(3, "Pack latas cocacola", 3.0),
    Delta(7, "Bolsa papa-delta", 1.0),
    Gusanitos(9, "Gusanitos RISI", 1.5),
    Medianoches(8, "Paquete medianoches", 1.5),
    Donuts(11, "Paquete donuts", 1.5),
    Palomitas(10, "Paquete Palomitas ketchup", 1.5),
    Judias(15, "Judias merca-power", 1.5),
    Azucar(14, "Azucar", 1.5),
    Chucherias(12, "Bolsa chucherias", 2.0),
    RedBull(2, "Redbull", 2.0),
    CocaCola(4, "CocaCola", 1.7),
    Pan(13, "Barra pan", 1.0),
    BotellaOxigeno(16, "Botella oxigeno activo", 2.0),
    Campesinas(6, "Lays campesinas", 2.0),
    Bolsa1(16, "Bolsa 1", 14.2),
    Bolsa2(17, "Bolsa 2", 7.5),
    Bolsa3(18, "Bolsa 3", 9.5),
    Bolsa4(19, "Bolsa 4", 10.2);

    // Atributos que utilizan las opciones del enum //
    final int codigoProducto;
    final String nombreProducto;
    final double precioProducto;

    // Constructor por defecto con el nombre de los productos y el precio //
    private Productos(int codigoProducto, String nombreProducto, double precioProducto) {
        this.codigoProducto = codigoProducto;
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
    }

    // Getters //
    public int getCodigoProducto() {
        return codigoProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    // Método toString //
    @Override
    public String toString() {
        return codigoProducto + " " + nombreProducto + ": " + precioProducto + "€";
    }
}
