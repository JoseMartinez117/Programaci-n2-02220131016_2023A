/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller_1_punto_1;

/**
 *
 * @author Jose Manuel
 */
public class Taller_1_punto_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    
    int b = (int)(Math.random()*2023+1);
    int z, a = 0;
    int[] vec1 = new int [b];
    

    
    
    
    // Tabla de multiplicar con while
    
        System.out.println("Tabla de multiplicar con While 1.1");
        System.out.println("");

        while (a !=b){
           
            a++;
            z=a*b;
            System.out.println(b+" x "+a+" = "+z);
            
        }
        
    // Tabla de multiplicar con do while
        System.out.println("");
        System.out.println("");
        System.out.println("Tabla de multiplicar con Do while 1.2");
        System.out.println("");
  
        a=0;
               
        do{
            
            a++;
            
            z=a*b;
            
            System.out.println(b+" x "+a+" = "+z);
            
            
        }while (a != b);
        
    // Tabla de multiplicar con for

        System.out.println("");
        System.out.println("");
        System.out.println("Tabla de multiplicar con For 1.3");
        System.out.println("");
    
    for ( a=1; a<=b; a++ ){
      
            z=a*b;
            System.out.println(b+" x "+a+" = "+z);
    }
        
        
         // Tabla de multiplicar con for each
         a=0;
        System.out.println("");
        System.out.println("");
        System.out.println("Tabla de multiplicar con For each 1.4");
        System.out.println("");
        
        for(int i=0; i<vec1.length; i++){
            a++;                            // Agregar los resultados de la multiplicacion al vector
           vec1[i] = a*b;
        }
        a=0;
        
        for(int i: vec1){
            a++;                    // Salida de datos atraves del For Each
            System.out.println(b+" x "+a+" = "+i);
        
        }
        
    }
    
}
