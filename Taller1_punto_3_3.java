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
public class Taller1_punto_3_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        teclado.useDelimiter("\n");
        int almacen = (int)(Math.random()*23+1);
        String[] nombre = new String[almacen];
        int[] cantidad = new int [almacen];
        double[] precio = new double [almacen];
        boolean valido = false;
        String aux="";
        int comprobar, i=0;
        System.out.println("Ingrese los "+almacen+" productos" );
        
        
        /* Ingresar los productos */
        
        while(i<almacen){
            
               do{
                    System.out.print("Ingresa el nombre del producto:");
                    aux=teclado.next();   
                    if(aux.matches("[a-zA-Z]*")){
                       nombre[i]=aux;
                       valido=true;
                    }else{
                        System.out.println("\n Ingrese de manera correcta el nombre del producto \n");
                    }
               }while(valido==false);
                
               valido=false;
               
                do{
                    System.out.print("Ingrese la cantidad de productos: ");
                    aux=teclado.next();
                    
                    if(aux.matches("[0-9]*")){
                        comprobar = Integer.parseInt(aux);
                        cantidad[i]=comprobar;
                        valido=true;
                    }else{
                        System.out.println("\n Ingrese de manera correcta la cantidad \n"); 
                    } 
                }while(valido==false);
                
                valido=false; 
                do{
                    System.out.print("Ingrese el precio del producto: ");
                    aux=teclado.next();
                    
                    if(aux.matches("[a-zA-Z]*")){
                        System.out.println("\n Ingrese de manera correcta el precio del producto \n"); 
                        
                    }else{
                        comprobar = (int) Double.parseDouble(aux);
                        precio[i]=comprobar;
                        valido=true;
                    } 
                }while(valido==false);
                 
                 System.out.println("");
              i++;   
        }
        System.out.println("\n");
       
        
        /* Salida de datos */
        i=0; 
        
        while(i<almacen){
            
   
                System.out.print("Producto: "+nombre[i]+"\n");
         
                
            
            
       
               System.out.print("Cantidad: "+cantidad[i]+"\n");
       
           
            

                System.out.print("el precio es: "+precio[i]+"\n");
                 
            
            
            System.out.println("");
         i++;
        }
        
    }
    
}
     
    
    
