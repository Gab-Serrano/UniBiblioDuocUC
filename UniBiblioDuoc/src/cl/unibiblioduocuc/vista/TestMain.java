/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.unibiblioduocuc.vista;

import cl.unibiblioduocuc.modelo.DataBase;
import cl.unibiblioduocuc.modelo.Libro;

/**
 *
 * @author Gabriel Serrano
 * @version 1.1
 */
public class TestMain {

    public static void main(String[] args) {
        
        DataBase db = new DataBase();
        
        for (Libro libro : db.getLibros()) {
            libro.imprimirDetalles();
        }
    }
}
