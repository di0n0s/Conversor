/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertidor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author sfcar
 */
public class Convertidor {

    /**
     * @param args  
     */
    public static void main(String[] args) {

        String line;
        
        try {//Meto en un try por si salta una IOException
            
            BufferedReader entradaHijo = new BufferedReader(new InputStreamReader(System.in, "UTF-8"));//Buffer encargado de recibir la salida del padre
           
            while ((line = entradaHijo.readLine()) != null) {//Mientras reciba frases...
                String[] palabras = line.toUpperCase().split(" ");//Divídelo en palabras

                String[] arrayInvert = new String[palabras.length];//Declaro un nuevo Array con el tamaño del array anterior

                int contador = 0;

                for(String palabra : palabras){ //Recorro cada palabra...
                    StringBuilder stringBuilder = new StringBuilder(palabra);
                    String palabraInvert = stringBuilder.reverse().toString();//Le doy la vuelta cada una
                    arrayInvert[contador] = palabraInvert;//Meto cada una en el Array
                    contador++;
                }
                
                StringBuffer bufferFraseInvertida = new StringBuffer();//Declaro un StringBuffer para 

                for (String palabraInvertida : arrayInvert) {//Recorro cada palabra invertida...
                    bufferFraseInvertida = bufferFraseInvertida.append(palabraInvertida).append(" ");//Concateno cada palabra dentro del buffer
                }
                    
                System.out.println(bufferFraseInvertida);//Imprimo por pantalla              
            }    
        } catch (IOException ioE){
            
            System.out.println("Error: "+ioE.getMessage());
        }
    }
}
