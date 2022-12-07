/*
2- Crear una clase Prueba (Archivo Prueba.java) con el método main donde:
Debe crear 3 instancias de la clase Tv.
Debe asignar valores a cada uno de sus atributos.
Debe invocar cada uno de sus métodos.
 */
package com.java.Tarea2_1;

import javax.swing.JOptionPane;
/**
 *
 * @author donyc
 */
public class Prueba{
    public static void main(String[] args) {
        int opcion; // Declaramos la variable opcion para seleccionar que metodo usar.
        Tv controlar = new Tv(); 
        Tv estado = new Tv(); 
        Tv canal = new Tv(); // Creamos tres instancias de la clase Tv para hacer uso de los metodos
        canal.canal = 1; // Asignamos valor al atributo canal, que en este caso sera el canal 1 el canal default
        estado.estado = false; // Asignamos el valor false al atributo estado, indicando que por default la Tv esta apagada
        controlar.brillo = 50; // Asignamos el valor 50 al atributo brillo, 50 es el brillo predeterminado
        controlar.volumen = 50; // Asignamos el valor 50 al atributo volumen, 50 es el volumen predeterminado
        do{
        opcion = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                                  Control
                                                              
                                                              | 1. Encender TV          
                                                              | 2. Apagar TV            
                                                              | 3. Subir Volumen        
                                                              | 4. Bajar Volumen        
                                                              | 5. Seleccionar canal    
                                                              | 6. Subir brillo         
                                                              | 7. Bajar brillo         
                                                              | 8. Dejar de usar el control(Salir)""")); /* Creamos el control del Tv donde seleccionaremos
        la opcion para probar uno de los metodos de Tv.
        */
        switch(opcion){
            case 1:
                JOptionPane.showMessageDialog(null, estado.encenderTV());
                break;
            case 2:
                JOptionPane.showMessageDialog(null, estado.apagarTV());
                break;
            case 3:
                JOptionPane.showMessageDialog(null, controlar.subirVolumen());
                break;
            case 4:
                JOptionPane.showMessageDialog(null, controlar.bajarVolumen());
                break;
            case 5:
                JOptionPane.showMessageDialog(null, canal.seleccionCanal());  
                break;
            case 6:
                JOptionPane.showMessageDialog(null, controlar.subirBrillo());
                break;
            case 7:
                JOptionPane.showMessageDialog(null, controlar.bajarBrillo());
                break;
        }/* Creamos este switch tomando como referencia la opcion seleccionada, para saber que metodo invocar, e invocamos el metodo seleccionado para 
        ejecutarlo y presentarlo en la ventana.
        */
        }while(opcion!= 8);
    }
}
