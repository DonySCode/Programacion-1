/*
1- Crear la clase Tv y agregar al menos 4 atributos y cuatro métodos. (Archivo Tv.Java)
- En cada método debe imprimir la acción que se está realizando dentro del método tal y como se explicá en el vídeo de la clase virtual de la lección. 
 */
package com.java.Tarea2_1;

import javax.swing.JOptionPane;
/**
 *
 * @author donyc
 */
public class Tv {
    boolean estado; // Declaramos la variable estado que indicará si el Tv esta encendido o apagado
    int brillo; // Declaramos la variable brillo, que indicará el brillo del Tv en una escala de 1 a 100
    int volumen; // Declaramos la variable volumen, que indicará el volumen del Tv en una escala de 1 a 100
    int canal; // Declaramos la variable canal que indicará, el canal que se estará viendo en el Tv al momento
    
    public String encenderTV(){ // Creamos el primer metodo, el metodo encenderTv
        JOptionPane.showMessageDialog(null,"Encendiendo tv..."); // Indicamos lo que se esta realizando dentro de este metodo
        if(estado){ // Si la TV esta encendida este indicara que la TV ya esta encendida.
        return("La TV ya esta encendida");          
        }
        estado = true; // En caso de que no este encendida pasara a esta parte del codigo lo cual la encendera.
        return("La TV ha sido encendida."); // Devolvemos la cadena "La TV ha sido encendida." indicando que acabamos de encender la misma
    }
    public String apagarTV(){ // Creamos el segundo metodo, el metodo apagarTV
        if(estado) return("Apagando tv..."); // Si la TV estaba encendida indicamos que se esta apagando.
        return(""); // Devolvemos la cadena con nada indicando que ya la TV esta apagada.
    }
    public String bajarVolumen(){ // Creamos el tercer metodo, el metodo bajarVolumen
        if(volumen == 1) return("Volumen minimo alcanzado!!"); /* Si el volumen esta en 1 no se puede bajar mas porque la escala va de 1 a 100 en esta Tv, por lo tanto retornamos
        este mensaje. */
        JOptionPane.showMessageDialog(null,"Bajando volumen..."); // Indicamos lo que se esta realizando dentro de este metodo
        volumen--; // Decrementamos el volumen en 1;
        return("Volumen: "+volumen); // Devolvemos la cadena "Volumen:" indicando el volumen actual.
    }
    public String subirVolumen(){ // Creamos el cuarto metodo, el metodo subirVolumen
        if(volumen == 100) return("Volumen máximo alcanzado!!"); /* Si el volumen ya esta en 100 no se puede incrementar mas, la escala de volumen en esta TV va de 1 a 100, por
        lo tanto no se puede subir mas, y retornamos este mensaje.
        */
        JOptionPane.showMessageDialog(null,"Subiendo volumen..."); // Indicamos lo que se esta realizando dentro de este metodo
        volumen++; // Incrementamos el volumen en 1;
        return("Volumen: "+volumen); // Devolvemos la cadena "Volumen:" indicando el volumen actual
    }
    public String bajarBrillo(){ // Creamos el quinto metodo, el metodo bajarBrillo
        if(brillo == 1) return("Brillo minimo alcanzado!!"); /* Si el brillo esta en 1 no se puede bajar mas porque la escala va de 1 a 100 en esta Tv, por lo tanto retornamos
        este mensaje.
        */
        JOptionPane.showMessageDialog(null,"Bajando brillo..."); // Indicamos lo que se esta realizando dentro de este metodo
        brillo--; // Decrementamos el brillo en 1
        return("Brillo: "+brillo); // Devolvemos la cadena "Brillo:" indicando el brillo actual
    }
    public String subirBrillo(){ // Creamos el sexto metodo, el metodo subirBrillo
        if(brillo == 100) return("Brillo máximo alcanzado!!"); /* Si el brillo ya esta en 100 no se puede incrementar mas, la escala de brillo en esta TV va de 1 a 100, por
        lo tanto no se puede subir mas, y retornamos este mensaje.
        */
        JOptionPane.showMessageDialog(null,"Subiendo brillo..."); // Indicamos lo que se esta realizando dentro de este metodo
        brillo++; // Incrementamos el brillo en 1
        return("Brillo: "+brillo); // Devolvemos la cadena "Brillo:" indicando el brillo actual
    }
    public String seleccionCanal(){ // Creamos el septimo metodo, el metodo seleccionCanal
        canal = Integer.parseInt(JOptionPane.showInputDialog("Seleccione el canal: ")); //Pedimos el canal que se desea sintonizar.
        JOptionPane.showMessageDialog(null,"Sintonizando canal..."); // Indicamos lo que se esta realizando dentro de este metodo
        return("Usted esta viendo el canal : "+canal); // Indicamos el canal sintonizado.
    }
}
