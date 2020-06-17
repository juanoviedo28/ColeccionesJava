
package pruebahashset;

import java.util.HashSet;
import java.util.Set;


public class PruebaHashSet {

    
    public static void main(String[] args) {
    
        Set<String> lista = new HashSet<>();
        
        lista.add("A");
        lista.add("B");
        lista.add("C");
        lista.add("D");
        lista.add("Z");
        
        //No admite valores duplicados
        
        lista.add("A");
        
        // Aqui Eliminamos Z..
        lista.remove("Z");
        
        // Cantidad de Elementos..
        
        System.out.println("Cantidad de Elementos: "+lista.size());
    
        
        for(String dato : lista){
            System.out.println(dato);
        }
        
        
        
        
    }
    
}
