
package taller_1_punto_2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import java.text.DecimalFormat;

public class Taller_1_punto_2 {


    public static void main(String[] args) {
        
        
        Scanner teclado = new Scanner(System.in);
        double moda=0, moda2=0, mediana=0, media=0, a=0, b=0, z=0,aux2=0, aux3=0, cont=0, aux4=0, aux5=0; //Declaramos las variables a usar en el codigo
        
        int aux;
        
   
        aux = (int)(Math.random()*16+1); //Utilizamos la funcion math.random para generar un numero aleatorio de 0 a 16 que sera la cantidad de espacios que tendra el vector
        
        if(aux>1){
            double[] vec1 = new double [aux];   // Creamos el vector y le agregamos el tamaño previamente generado

            DecimalFormat df= new DecimalFormat("#.00");

            /* Ingreso de datos al vector */

           System.out.println("Ingrese los "+aux+" valores:\n");
            for(int f=0; f<vec1.length;f++){                   
                System.out.print("Ingresar nuevo dato: ");

                vec1[f]=teclado.nextInt();

            }



            // Calcular la mediana
            Arrays.sort(vec1);
            b=aux/2;   //Dividimos por 2 para encontrar la mitad del vector
            a=aux%2;   // Sacamos el residuo de la division y la almacenamos
            Math.round(b);  // redondeamos la division del vector al numero entero mas cercano,
            z=b+1;       


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

               for (int i = 0; i < vec1.length; i++) {             // Proceso para hayar la media
                media+=vec1[i];
            }
              media=media/aux;

            System.out.println("\n La media es: "+df.format(media));





           // Calcular la moda


              for (int i=0; i<vec1.length; i++){       //Proceso para hayar la moda 
                  cont=vec1[i];
                  if (aux4 == cont){            
                  moda=aux4;

                  }else{
                  aux4=cont;
                  }
              }   

              cont=0;                           

              for (int i=0; i<vec1.length; i++){    //Proceso para hayar la moda multiple
                  cont=vec1[i];
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
        }else if(aux==1) {
            media=1;
            moda=1;
            mediana=1;
            
            System.out.println("La mediana es:  "+mediana);
            System.out.println("La media es: "+media);
            System.out.println("\n No hay una moda, todos comparten la misma cantidad: "+moda);
        }

        } 
        }


