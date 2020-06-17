
package pruebaarray;


import java.util.ArrayList;


public class PruebaArray {
    
    public static void imprimir(ArrayList<String>lista){
    
    for(String elemento: lista){
        System.out.println(elemento+" ");
    
    }
    
        System.out.println(" ");
    }

   
    public static void main(String[] args) {
        
        ArrayList<String> lista1 = new ArrayList<>();
        
        // Insertamos Elementos ..
        
        lista1.add("Juan");
        lista1.add("Luis");
        lista1.add("Carlos");
        imprimir(lista1);
        lista1.add(1,"Maria");
        imprimir(lista1);
        lista1.remove(0);
        imprimir(lista1);
        //Esta Coleccion permite duplicados
        lista1.add("Ruben");
        lista1.add("Ruben");
        imprimir(lista1);
        System.out.println("Cantidad de Elementos: "+lista1.size());
        
        
        
        
    }
    
}
