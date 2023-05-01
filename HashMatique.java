import java.util.HashMap;
import java.util.ArrayList;

public class HashMatique{

    public static void main(String[] args){
        HashMap<String, String> canciones = new  HashMap<String, String>();
        canciones.put("Libertad", " Jazz the roots");
        canciones.put("otra cancion", "asdf poiopi klkjlkj weoeoeop[allaskj]");
        canciones.put("Clint Eastwood ", "Gorillaz tan tanta tan tantan tanta tan");
        canciones.put("Clint Eastwood ", "Gqorillaz tan tanta tan tantan tanta tan");


        System.out.println(canciones.getClass() + " la clase de esta instancia es :");git 
        System.out.println(canciones.get("Libertad"));

        for(String llave: canciones.keySet()){
            System.out.println(" Cancion : " + llave + "  "+ canciones.get(llave));
        }

        canciones.forEach((x,v)->{
            System.out.println("key: " + x + " " + "value: " +v );
        });

        /// Ejemplo excepciones
        ArrayList<Object> myList = new ArrayList<Object>();
            myList.add("13");
            myList.add("Hola Mundo");
            myList.add(48);
            myList.add("Adios Mundo");
            myList.add(true);

            System.out.println(myList.get(0).getClass());
            System.out.println(myList);

/* La clase ArrayList<Object> en Java se utiliza cuando necesitas crear una lista dinámica que 
pueda contener objetos de cualquier tipo. Es decir, cuando necesitas almacenar elementos de diferentes 
clases en una misma lista.
Esta clase es útil cuando no se conoce el tipo de dato de los objetos que se van a almacenar en la lista de antemano, 
o cuando se necesitan almacenar objetos de diferentes tipos en una misma lista. Por ejemplo, si necesitas crear una lista 
que almacene objetos de diferentes clases, como String, Integer, Double, etc., puedes utilizar ArrayList<Object>.
*/
    for(int i=0; i<myList.size();i++){
        try{
            Integer convertirDato = (Integer) myList.get(i);
        }
        catch (ClassCastException excepcion){
            // System.out.println(excepcion);
            System.out.println("No pude hacer cast de esto: " + myList.get(i));
        }
    }

    }
}