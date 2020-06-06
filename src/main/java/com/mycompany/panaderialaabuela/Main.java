/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.panaderialaabuela;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Enrique
 */
public class Main {

    public static void main(String[] args) {
        // Importamos el método de escaner con el nombre de teclado.
        Scanner teclado = new Scanner(System.in);
        // instanciamos un valor para los datso registrados por teclado.
        int respN;

        ArrayList<Productos> bolsa = new ArrayList<>();
        //Creamos un array para la bolsa5.
        Productos[] producto = {Productos.Monster, Productos.RedBull, Productos.CocaColaLata, Productos.CocaCola, Productos.Patatas,
            Productos.Campesinas, Productos.Delta, Productos.Medianoches, Productos.Gusanitos, Productos.Palomitas,
            Productos.Donuts, Productos.Chucherias, Productos.Pan, Productos.Azucar, Productos.Judias, Productos.BotellaOxigeno};

        Menu.MostrarMenu();

        // Creamos un bucle en el cual solo aceptamos los numeros 1 o 2.
        do {
            System.out.println("¿Desea comprar una bolsa predefinida?");
            System.out.println("1 -- Si");
            System.out.println("2 -- No");
            System.out.println("3 -- Salir");
            respN = teclado.nextInt();
        } while (!(respN == 1 || respN == 2 || respN == 3));
        // Creamos un switch con el cual acceda a cualquiera de las 3 opciones con sus distintas respuestas.
        switch (respN) {
            // En caso de que el numero introduccido sea el 1 mostraremos las 4 posibles bolsas, el precio lo 
            // dimos antes y para no generar muchos datos no lo repetiremos.
            case 1:
                do {
                    System.out.println("Elige la bolsa que desees");
                    System.out.println("1, Bolsa1");
                    System.out.println("2, Bolsa2");
                    System.out.println("3, Bolsa3");
                    System.out.println("4, Bolsa4");
                    respN = teclado.nextInt();
                    // Creamos un bucle para que solo valgan las opciones entre el 1 al 4.
                } while (respN <= 0 && respN >= 5);
                // Respuestas antes las posibles opciones de las bolsas.
                switch (respN) {
                    case 1:
                        System.out.println("Gracias, compraste la bolsa 1");
                        break;
                    case 2:
                        System.out.println("Gracias, compraste la bolsa 2");
                        break;
                    case 3:
                        System.out.println("Gracias, compraste la bolsa 3");
                        break;
                    case 4:
                        System.out.println("Gracias, compraste la bolsa 4");
                        break;
                }
                break;
            // En caso que el numero sea 2 mostraremos el menú con todos los productos y los precios. Controlaremos que 
            // solo podamos usar los numeros de los codigos o el 17 para salir.
            case 2:
                do {
                    Menu.MostrarMenu2();
                    respN = teclado.nextInt();

                    if (respN > 0 && respN < 17) {
                        bolsa.add(producto[respN - 1]);

                    } else if (respN == 17) {
                        System.out.println("");

                    } else {
                        System.out.println("");
                        System.out.println("El número introducido no es valido, Introduzca otro");
                        System.out.println("");
                    }

                } while (respN != 17);
                System.out.println("");
                System.out.println("El precio de su Bolsa es de: " + precioBolsa(bolsa) + "€");
                break;
            // En caso que sea el 3 nos despedimos del cliente
            case 3:
                System.out.println("Gracias por la visita, que tenga un buen día");
                break;
        }
    }

    //Método para sacar el precio de la bolsa 5.
    // En el usamos el arrayList creado anteriormente y a partir de un precio 0, le añadimos el precio de cada producto que se encuentre en el array.
    private static double precioBolsa(ArrayList<Productos> producto) {
        double precio = 0;
        // bucle para recorrer todo el array.
        for (int i = 0; i < producto.size(); i++) {
            precio = precio + producto.get(i).getPrecioProducto();
        }
        return precio;
    }
}
