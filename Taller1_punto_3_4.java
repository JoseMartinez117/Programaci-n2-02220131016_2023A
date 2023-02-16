/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller1_punto_3;

import java.util.Scanner;

/**
 *
 * @author Jose Manuel
 */
public class Taller1_punto_3_4 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
        teclado.useDelimiter("\n");
        int almacen = (int)(Math.random()*23+1);
        String[] nombre = new String[almacen];
        int[] cantidad = new int [almacen];
        double[] precio = new double [almacen];
        boolean valido = false;
        String aux="";
        int comprobar, h = 0, z=0;
        System.out.println("Ingrese los "+almacen+" productos" );
        
        
        /* Ingresar los productos */

            for(String i: nombre){
               do{
                    System.out.print("Ingresa el nombre del producto:");
                    aux=teclado.next();   
                    if(aux.matches("[a-zA-Z]*")){
                       nombre[h]=aux;
                       valido=true;
                    }else{
                        System.out.println("\n Ingrese de manera correcta el nombre del producto \n");
                    }
               }while(valido==false);
               h++;
            }   
                System.out.println("");
                h=0;
               valido=false;
            for(int i: cantidad){   
                do{
                    System.out.print("Ingrese la cantidad de productos: ");
                    aux=teclado.next();
                    
                    if(aux.matches("[0-9]*")){
                        comprobar = Integer.parseInt(aux);
                        cantidad[h]=comprobar;
                        valido=true;
                    }else{
                        System.out.println("\n Ingrese de manera correcta la cantidad \n"); 
                    } 
                }while(valido==false);
                h++;
            }
                System.out.println("");
                h=0;
                valido=false; 
            for(double i: precio){   
                do{
                    System.out.print("Ingrese el precio del producto: ");
                    aux=teclado.next();
                    
                    if(aux.matches("[a-zA-Z]*")){
                        System.out.println("\n Ingrese de manera correcta el precio del producto \n"); 
                        
                    }else{
                        comprobar = (int) Double.parseDouble(aux);
                        precio[h]=comprobar;
                        valido=true;
                    } 
                }while(valido==false);
                h++;
            }     
                 System.out.println("");
        
                 
                 
        System.out.println("\n");
        
     
        /* Salida de datos */
           
        
        
      
            

              System.out.println("Los productos seleccionados fueron");
               for(String i : nombre){
                System.out.print("Producto: "+i+"\n");
               }
                System.out.println("");
            
            System.out.println("La cantidad de los productos seleccionados fue");
               for(int i: cantidad){
               System.out.print("Cantidad: "+i+"\n");
               }
               System.out.println("");
               
            System.out.println("El precio de los productos seleccionados es");
               for (double i: precio){
                System.out.print("el precio es: "+i+"\n");
               }  
               System.out.println("");
            
            
      
       
        
    }
    
}
  
