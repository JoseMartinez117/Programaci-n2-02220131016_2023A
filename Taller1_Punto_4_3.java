/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller1_punto_4;

import java.util.Scanner;

/**
 *
 * @author Jose Manuel
 */
public class Taller1_Punto_4_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
    
    String raiz=" ", aux=" ";
    String[] vec1 = new String[4];
    boolean valido=false;
    int h=0;
    int i=0;
    
  do{  
    System.out.println("Ingresa la palabra raiz: "); 
        raiz=teclado.next();
     if(raiz.matches("[a-zA-Z]*")){
      valido=true;
     }else{
         System.out.println("Ingrese una palabra de manera correcta. \n");
     }
        
  }while(valido==false); 
    
  valido=false;
  
    System.out.println("Ingresa 4 palabras mas: ");
    
    for (int f = 0; f < 4; f++) {
         do{
              System.out.print("Ingrese palabra #"+(f+1)+": ");
                    aux=teclado.next();   
                    if(aux.matches("[a-zA-Z]*")){
                       vec1[h]=aux;
                       valido=true;
                    }else{
                        System.out.println("\n Ingrese de manera correcta el nombre del producto \n");
                    }
               }while(valido==false);
               h++;
    }
    
       
    while (i < vec1.length) {
      int j = 0;
      while (j < vec1[i].length()) {
        if (raiz.contains(String.valueOf(vec1[i].charAt(j)))) {
          System.out.println("\n La palabra " + vec1[i] + " encaja en la palabra base \n");
          break;
        }
        j++;
      }
      i++;
    }
    
    
}
}