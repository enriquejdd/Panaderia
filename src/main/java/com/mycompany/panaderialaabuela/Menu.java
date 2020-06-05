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
public class Menu {

    // Metodo para mostrar los datos de las bolsas para luego mostrarlos en el main
    public static void MostrarMenu() {
        // Instanciamos las 5 posibles bolsas de las que disponemos //
        BolsaUno bolsa = new BolsaUno();
        BolsaDos bolsa2 = new BolsaDos();
        BolsaTres bolsa3 = new BolsaTres();
        BolsaCuatro bolsa4 = new BolsaCuatro();

        // Mostramos en pantalla las bolsas predefinidad y avisamos que tambien pueden crear una por cuenta propia
        System.out.println("También disponemos de las siguientes bolsas con un descuento de 1.5€");
        System.out.println("Bolsa 1: " + bolsa.getdescripcion() + "\nCon un valor de: " + bolsa.precio() + "€");
        System.out.println("");
        System.out.println("Bolsa 2: " + bolsa2.getdescripcion() + "\nCon un valor de: " + bolsa2.precio() + "€");
        System.out.println("");
        System.out.println("Bolsa 3: " + bolsa3.getdescripcion() + "\nCon un valor de: " + bolsa3.precio() + "€");
        System.out.println("");
        System.out.println("Bolsa 4: " + bolsa4.getdescripcion() + "\nCon un valor de: " + bolsa4.precio() + "€");
        System.out.println("");

        System.out.println("Finalmente disponemos de bolsas creadas por el usuario pero sin descuento");
    }
    
    // Metodo para mostrar los productos y luego mostrarlos en el main
    public static void MostrarMenu2() {
        // Mostramos por pantalla todos los productos de los que dispone la tienda, con Codigo para identificar más facilmente, nombre del producto y su precio
        System.out.println("Los productos de los que disponemos y sus precios son:");
        System.out.println(Productos.Monster.toString());
        System.out.println(Productos.RedBull.toString());
        System.out.println(Productos.CocaColaLata.toString());
        System.out.println(Productos.CocaCola.toString());
        System.out.println(Productos.Patatas.toString());
        System.out.println(Productos.Campesinas.toString());
        System.out.println(Productos.Delta.toString());
        System.out.println(Productos.Medianoches.toString());
        System.out.println(Productos.Gusanitos.toString());
        System.out.println(Productos.Palomitas.toString());
        System.out.println(Productos.Donuts.toString());
        System.out.println(Productos.Chucherias.toString());
        System.out.println(Productos.Pan.toString());
        System.out.println(Productos.Azucar.toString());
        System.out.println(Productos.Judias.toString());
        System.out.println(Productos.BotellaOxigeno.toString());
        System.out.println("17 Salir");
        System.out.println("");
    }
}
