
package pruebahashmap;

import java.util.HashMap;
import java.util.Map;


public class PruebaHashMap {

  
    public static void main(String[] args) {
        Map<String, String> mapa1 = new HashMap<String, String>();
        
        mapa1.put("rojo","Red");
        mapa1.put("verde", "green");
        mapa1.put("azul", "blue");
        mapa1.put("blanco", "white");
        System.out.println("Listado Completo de valores: ");
        for(String valor: mapa1.values()){
        
            System.out.println(valor+" ");
        }
        System.out.println(" ");
        
        //Para recuperar las claves 
        
        System.out.println("Listado completo de las claves: ");
        for(String clave:mapa1.keySet()){
            System.out.println(clave+" ");
            
        }
        System.out.println(" ");
        System.out.println("La traduccion de rojo es " + mapa1.get("rojo") );
        if(mapa1.containsKey("negro")){
            System.out.println("si");  
        } else {
        
            System.out.println("no");
        }
    }
    
}

