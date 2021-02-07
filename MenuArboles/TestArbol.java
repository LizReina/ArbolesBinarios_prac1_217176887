/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MenuArboles;

import arboles.ArbolAVL;
import arboles.ArbolBusquedaBinaria;
import arboles.Exception.ExceptionOrdenInvalida;
import arboles.IArbolBinario;
import arboles.Mvias;
import java.util.Scanner;

/**
 *
 * @author brandon
 */
public class TestArbol {
    public static void main(String[] args) throws ExceptionOrdenInvalida{
      IArbolBinario<Integer,String> ArbolDeBusqueda = null;
      Scanner entrada= new Scanner(System.in);
        System.out.println("elija el tipo de arbol,ABB, AVL");
    
        
        String tipoDeArbol=entrada.next();
        tipoDeArbol=tipoDeArbol.toUpperCase();
     switch(tipoDeArbol){
          
          case("ABB"):
              ArbolDeBusqueda=new ArbolBusquedaBinaria<>();
              break;
        
          case("AVL"):
              ArbolDeBusqueda=new ArbolAVL<>();
          break;
      
          default:
              System.out.println("tipo de arbol invaldo, escogiendo.. arbol binario de Mvias");
               ArbolDeBusqueda=new ArbolBusquedaBinaria<>();
      }
      
              ArbolDeBusqueda.insertar(20, "cristian soza");
              ArbolDeBusqueda.insertar(7, "julio gonzales");
            //  ArbolDeBusqueda.insertar(23, "llanos");
          /*    ArbolDeBusqueda.insertar(9, "mario");
              ArbolDeBusqueda.insertar(11, "armando");
              ArbolDeBusqueda.insertar(25, "julia");
              ArbolDeBusqueda.insertar(4, "berta");
              ArbolDeBusqueda.insertar(3, "marcela"); 
              ArbolDeBusqueda.insertar(22, "carol");
              ArbolDeBusqueda.insertar(10, "valeria");
              ArbolDeBusqueda.insertar(8, "valeria");
              ArbolDeBusqueda.insertar(24, "valeria");
              ArbolDeBusqueda.insertar(50, "valeria");
              ArbolDeBusqueda.insertar(100, "valeria");
              ArbolDeBusqueda.insertar(35, "valeria");*/
           
           System.out.println(ArbolDeBusqueda.mostrarArbol());
            
       int opcion= -1;
     Scanner ponerDato= new Scanner(System.in);
     int cantidad;
    while(opcion!=0){
       System.out.println("Introduca Una Opcion ");
       opcion=entrada.nextInt();
      
        switch(opcion){
         
            case 1:  
              //  2. Implemente un método recursivo que retorne la cantidad nodos que tienen solo hijo izquierdo no vacío en un árbol binario 
                System.out.println("pregunta 2-> " + ((ArbolBusquedaBinaria)ArbolDeBusqueda).cantidadNodosSoloHijoIzq());
            break;    
           
            case 2:  
              //  3. Implemente un método iterativo que retorne la cantidad nodos que tienen solo hijo izquierdo no vacío en un árbol binario 
                System.out.println("pregunta 3-> " + ((ArbolBusquedaBinaria)ArbolDeBusqueda).cantidadNodosSoloHijoIzquierdo());
            break;   
            
            case 3:  
               // 4. Implemente un método recursivo que retorne la cantidad nodos que tienen solo hijo izquierdo no vacío en un árbol binario,
                //pero solo en el nivel N 
                System.out.println("pregunta 4-> " + ((ArbolBusquedaBinaria)ArbolDeBusqueda).cantidadHijoIzqNivel(ponerDato.nextInt()));
            break;   
            
             case 4:  
             // 5. Implemente un método iterativo que retorne la cantidad nodos que tienen solo hijo izquierdo no vacío en un árbol binario, 
              //pero solo después del nivel N 
                 
                 System.out.println("pregunta 5-> " + ((ArbolBusquedaBinaria)ArbolDeBusqueda).cantidadHijoIzqNivelIterativo(ponerDato.nextInt()));
            break;   
            
             case 5:  
            // 6. Implemente un método iterativo que retorne la cantidad nodos que tienen solo hijo izquierdo no vacío en un árbol binario,
              //       pero solo antes del nivel N 
              System.out.println("pregunta 6-> " + ((ArbolBusquedaBinaria)ArbolDeBusqueda).cantidadHijoIzqAntesNivelIterativo(ponerDato.nextInt()));
            break;   
            
             case 6:  
              // 7. Implemente un método recursivo que reciba como parámetro otro árbol binario de búsqueda que retorne verdadero, 
              //        si el árbol binario es similar al árbol binario recibido como parámetro, falso en caso contrario.
            IArbolBinario<Integer,String> arbolNuevo=new ArbolBusquedaBinaria<>();

              arbolNuevo.insertar(20, "cristian soza");
              arbolNuevo.insertar(7, "julio gonzales");
              arbolNuevo.insertar(23, "llanos");
           /*   arbolNuevo.insertar(9, "mario");
              arbolNuevo.insertar(11, "armando");
              arbolNuevo.insertar(25, "julia");
              arbolNuevo.insertar(4, "berta");
              arbolNuevo.insertar(3, "marcela"); 
              arbolNuevo.insertar(5, "marcela"); 
              arbolNuevo.insertar(22, "carol");
              arbolNuevo.insertar(10, "valeria");
              arbolNuevo.insertar(8, "valeria");
              arbolNuevo.insertar(24, "valeria");
              arbolNuevo.insertar(50, "valeria");
              arbolNuevo.insertar(100, "valeria");
              arbolNuevo.insertar(35, "valeria");*/
              
                 System.out.println("pregunta 7-> " + ((ArbolBusquedaBinaria)ArbolDeBusqueda).arbolSimilar((ArbolBusquedaBinaria) arbolNuevo));
           break; 
            
            
            case 7:  
         //8. Implemente el método eliminar de un árbol AVL
                
              ArbolDeBusqueda.insertar(20, "cristian soza");
              ArbolDeBusqueda.insertar(7, "julio gonzales");
              ArbolDeBusqueda.insertar(23, "llanos");
              ArbolDeBusqueda.insertar(9, "mario");
              ArbolDeBusqueda.insertar(11, "armando");
              ArbolDeBusqueda.insertar(25, "julia");
              ArbolDeBusqueda.insertar(4, "berta");
              ArbolDeBusqueda.insertar(3, "marcela"); 
              ArbolDeBusqueda.insertar(22, "carol");
              ArbolDeBusqueda.insertar(10, "valeria");
              ArbolDeBusqueda.insertar(8, "valeria");
              ArbolDeBusqueda.insertar(24, "valeria");
              ArbolDeBusqueda.insertar(50, "valeria");
              ArbolDeBusqueda.insertar(100, "valeria");
              ArbolDeBusqueda.insertar(35, "valeria");
             System.out.println("pregunta 8-> " + ((ArbolAVL)ArbolDeBusqueda).cantidadNodosAmbosHijos(ponerDato.nextInt()));
             break; 
            
            case 8:  
                //Para un árbol binario implemente un método que retorne la cantidad de nodos que tienen ambos hijos desde el nivel N. 
                  System.out.println("pregunta 9-> " + ((ArbolBusquedaBinaria)ArbolDeBusqueda).cantidadNodosAmbosHijos(ponerDato.nextInt()));
              break; 
            
            case 9:  
              // Implementar un método que retorne un nuevo árbol binario de búsqueda invertido 
                  System.out.println("pregunta 10-> " + ((ArbolBusquedaBinaria)ArbolDeBusqueda).arbolInvertido());
                  System.out.println(ArbolDeBusqueda.mostrarArbol());
                  
              break; 
              
            case 10:  
               // Implementar un método que retorne verdadero si un árbol binario esta lleno.
                  System.out.println("pregunta 11-> " + ((ArbolBusquedaBinaria)ArbolDeBusqueda).arbolEstaLleno());
              break; 
        }
    }   
 

 }     
    
    
}
