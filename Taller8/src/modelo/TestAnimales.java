/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author PEDRO LUIS MARTINEZ
 */
public class TestAnimales {
    public static void main(String[] args) {
        List<Animal> zoologico = new ArrayList<>();
        zoologico.add(new Perro("Rocky"));
        zoologico.add(new Gato("Pelusa"));

        for (Animal a : zoologico) {
            String mensaje = a.describir() + "\n" + a.hacerSonido();
            JOptionPane.showMessageDialog(null, mensaje);
            /*a.describir();        // llamado polimórfico
            a.hacerSonido();      // llamado polimórfico
        }*/
        }
           
    }
}
