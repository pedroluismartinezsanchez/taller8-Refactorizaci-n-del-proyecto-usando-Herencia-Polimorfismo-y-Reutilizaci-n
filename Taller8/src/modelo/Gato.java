/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author PEDRO LUIS MARTINEZ
 */

public class Gato extends Animal {

    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public String hacerSonido() {
        return nombre + " dice: Miau!";
    }
}
