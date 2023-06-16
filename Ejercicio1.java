/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1;

/**
 *
 * @author nes_j
 */
public class Ejercicio1 {
/*
    Enunciado del ejercicio:

Primera parte:
Crear una función con tres parámetros que sean números que se suman entre sí.
Llamar a la función en el main y darle valores.
    
Segunda parte:
Crear una clase coche.
Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
Una función que incremente el número de puertas que tiene el coche.
Crear un objeto miCoche en el main y añadirle una puerta.
Mostrar el número de puertas que tiene el objeto.
    */
    public static void main(String[] args) {
        //primera parte
        int result=0,puertas=0;
        result= fsuma(10,15,20);
        System.out.println(result);
        
        //segunda parte 
        Coche miCoche = new Coche();
        miCoche.AnadirPuertas();
        miCoche.AnadirPuertas();
        puertas = miCoche.puertas;
    
        System.out.println(puertas);
        
    }
    public static int fsuma(int a, int b, int c){
        int suma;
        suma = a+b+c;
        return  suma;
    }
    
    public static class Coche{
        int puertas=0;
        void AnadirPuertas(){
            this.puertas++;
        }
    }
}
