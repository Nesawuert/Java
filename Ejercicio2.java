/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2;

/**
 *
 * @author nes_j
 */

/*
-Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
Pista: Los números inferiores a 0 son negativos y los superiores, positivos.

-Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:
Incrementar el valor de la variable en uno cada vez que se ejecute.Mostrarlo por pantalla cada vez que se ejecute.

-Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.

-Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable sea igual o menor que 3, se irá incrementando 
en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.

-Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año. Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está. 
También habrá que poner un default para cuando el valor de la variable no sea una estación.

*/
public class Ejercicio2 {

    public static void main(String[] args) {
        int numero = 10;
        //PRIMERA PARTE
        System.out.println("*******PRIMERA PARTE*******");
        if(numero > 0){
            System.out.println("La variable es positiva");
            
        }else{
            System.out.println("La variable es negativa");
        }
        
        //SEGUNDA PARTE
        System.out.println("*******SEGUNDA PARTE*******");
        int iterador=0;
        while(iterador<3){
        iterador++;
        System.out.println(iterador);
    }
        
        //TERCERA PARTE
        System.out.println("*******TERCERA PARTE*******");
        int iterador2=0;
        do{
            iterador2=+3;
            System.out.println(iterador2);
        }while(iterador<3);
        
        //CUARTA PARTE
        System.out.println("*******CUARTA PARTE*******");
        for(int i=0;i<=3;i++){
            System.out.println(i);
        }
        
        //QUINTA PARTE
        System.out.println("*******QUINTA PARTE*******");
        var estacion = "Verano";
        switch(estacion){
            case "Verano":
                System.out.println("Estamos en Verano");break;
            case "Invierno":
                System.out.println("Estamos en Invierno");break;
            case "Otoño":
                System.out.println("Estamos en Otoño");break;
            case "Primavera":
                System.out.println("Estamos en Primavera");break;
            default:System.out.println("No es una estacion");
        }
        
        
        
    }
}
