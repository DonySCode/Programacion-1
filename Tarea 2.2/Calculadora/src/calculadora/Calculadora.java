/*
 * 1- Crear una clase Calculadora (Calculadora.java) con los métodos sumar, restar, multiplicar y dividir que reciba 
 * dos parámetros enteros y retorne el resultado (utilizar la palabra reservada return).
 * 2- Sobrecargar los métodos sumar, restar y multiplicar (no el dividir) para que reciba tres parámetros 
 * enteros y retorne el resultado (utilizar la palabra reservada return).
 * 3- Sobrecargar los métodos sumar, restar y multiplicar (no el dividir) para que reciba cuatro parámetros 
 * enteros enteros y retorne el resultado (utilizar la palabra reservada return).
 */
package calculadora;

import java.util.Scanner;

/**
 * @author donyc
 */
public class Calculadora { // Creacion de la clase publica Calculadora.
    public static void main(String[] args) { //Creacion del main para probar el funcionamiento de uno de los metodos.
        int n1, n2, n3; //Declaracion de las variables a recibir.
        Scanner entrada = new Scanner(System.in); //Declaracion y creacion del objeto de la clase Scanner para recibir los datos.
        Calculadora operacion = new Calculadora(); //Declaracion y creacion del objeto de nuestra clase Calculadora.
        
        System.out.println("Ingrese tres valores enteros a sumar: "); //Tomando los valores que tendran las variables n1, n2 y n3.
        n1 = entrada.nextInt();
        n2 = entrada.nextInt();
        n3 = entrada.nextInt();
        
        System.out.println("El resultado de la suma es: "+(operacion.sumar(n1, n2, n3)));/*
        Acá usamos el metodo sumar que sobrecargamos y también imprimimos el resultado del mismo.
        */
    }
    // Creacion de metodo sumar
    int sumar(int a, int  b){ 
        return a+b;
    }
    // Creacion de metodo restar
    int restar(int a,int b){ 
        return a-b;
    }
    // Creacion de metodo multiplicar
    int multiplicar(int a,int b){
        return a*b;
    }
    // Creacion de metodo dividir
    int dividir(int a,int b){
        return a/b;
    }
    // Sobrecarga del metodo sumar recibiendo 3 parametros
    int sumar(int a, int  b, int c){
        return a+b+c; // Retornando la suma de los 3 parametros
    }
    // Sobrecarga del metodo restar
    int restar(int a,int b, int c){
        return a-b-c; // Retornando la resta de los 3 parametros
    }
    // Sobrecarga del metodo multiplicar
    int multiplicar(int a,int b, int c){
        return a*b*c; // Retornando el producto de los 3 parametros
    }    
    // Sobrecarga del metodo sumar recibiendo 4 parametros
    int sumar(int a, int  b, int c, int d){
        return a+b+c+d; // Retornando la suma de los 4 parametros
    }
    // Sobrecarga del metodo restar
    int restar(int a,int b, int c, int d){
        return a-b-c-c; // Retornando la resta de los 4 parametros
    }
    // Sobrecarga del metodo multiplicar
    int multiplicar(int a,int b, int c, int d){
        return a*b*c*c; // Retornando el producto de los 4 parametros
    }    
}

