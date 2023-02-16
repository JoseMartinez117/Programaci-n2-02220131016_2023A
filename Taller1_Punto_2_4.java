/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller_1_punto_2;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Jose Manuel
 */
public class Taller1_Punto_2_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      Scanner teclado = new Scanner(System.in);
       double mediana, a, aux2 = 0, aux3 = 0;
       int moda = 0, media = 0, aux, b, z, almacen = 0, k=0, cont=0, aux4=0, moda2=0, aux5=0;
       DecimalFormat df= new DecimalFormat("#.00");
           
             aux = (int)(Math.random()*16+1); //Utilizamos la funcion math.random para generar un numero aleatorio de 0 a 16 que sera la cantidad de espacios que tendra el vector
            
   
       
       int vec1[] = new int [aux];
       
        System.out.println("Ingresa por favor los "+ aux +" datos \n");
       
       for(int i: vec1){ 
           System.out.print("Ingresar nuevo dato: ");
           vec1[almacen]=teclado.nextInt();
           almacen++;
       }
       

            // Calcular la mediana
            Arrays.sort(vec1);
            b=aux/2;   //Dividimos por 2 para encontrar la mitad del vector
            a=aux%2;   // Sacamos el residuo de la division y la almacenamos
            Math.round(b);  // redondeamos la division del vector al numero entero mas cercano,
            z=(b+1);       
                    if (a!=0){

                        for (int i=0; i<vec1.length; i++){              //Proceso para hayar la mediana cuando la cantidad es impar
                            if(i==b){

                                System.out.println("\n La mediana es: "+vec1[i]);
                            }
                        }

                    }else{
                        for (int i=0; i<vec1.length; i++){             //Proceso para hayar la mediana cuando la cantidad es par
                            if(i==b){
                                aux2=vec1[i];  
                            }

                            if(i==z){
                                aux3=vec1[i];
                            }

                        }
                        mediana=(aux2+aux3)/2;
                        System.out.println("\n La mediana es: "+mediana);

                    } 
                    
                    
           //Calcular media

               for (int i: vec1) {             // Proceso para hayar la media
                   k+=i;
               }  
              media=k/aux;

            System.out.println("\n La media es: "+df.format(media));




           // Calcular la moda


              for (int i: vec1){       //Proceso para hayar la moda 
                  cont=i;
                  if (aux4 == cont){            
                  moda=aux4;

                  }else{
                  aux4=cont;
                  }
              }   

              cont=0;                           

              for (int i: vec1){    //Proceso para hayar la moda multiple
                  cont=i;
                  if(moda!=cont && aux5==cont){
                   moda2=aux5;
                  }else{
                  aux5=cont;
                  }

              }

            if (moda<=0){                        //Comparador para definir si existe la moda, moda normal y la moda multiple

                System.out.println("\n No hay una moda, todos comparten la misma cantidad");

            }else if (moda>=1 && moda2>=1){

              System.out.println("\n La moda es: "+moda+" y "+moda2);

            }else if(moda>=1){
              System.out.println("\n La moda es: "+moda);

            }
 
                
            
    } 
    }
        

