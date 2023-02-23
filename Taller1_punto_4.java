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
public class Taller1_punto_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String [] vec1 = new String [5];
        boolean valido=true;
        String aux="";
        
    // Uso del FOR
    
        for(int i=0;i<vec1.length;i++){
        
        do{
            System.out.print("\n Ingrese la palabra n"+(i+1)+":");;
            aux=teclado.next();   
            if(aux.matches("[a-zA-Z]*")){
                vec1[i]=aux;
                valido=true;
            }else{
               System.out.println("\n Ingrese de manera correcta la palabra\n");
            }
        }while(valido==false);     
            
        }
        
        //inicio del proceso para el crucigrama
        for(int i=0;i<vec1.length;i++){
        
            
            int [] almacen = new int [vec1[i].length()]; //se crea la variable almacen para identificar si la letra esta disponible
            
            System.out.println("\n Palabra base para comparar "+vec1[i]+" \n");
            
            for(int h=0;h<vec1.length;h++){
                
                if(i==h){
                    h++;
                }

                if(h>=5){
                    break;
                }

                for(int j=0;j<vec1[i].length();j++){

                    valido=false;

                    for(int k=0;k<vec1[h].length();k++){
 
                        if(vec1[h].charAt(k)==vec1[i].charAt(j)&&almacen[j]!=1){

                            System.out.println("La letra "+vec1[h].charAt(k)+" de la palabra "+vec1[h]+" en caja en la letra "+vec1[i].charAt(j)+" de las palabras "+ vec1[i]);
                            valido=true;
                            break;
                        }
                    }
                    
                    if(valido==true){
                        almacen[j]=1;
                        break;
                    }
                }
            }
        }
        
        
        
        
        
        
        

        
    }
}