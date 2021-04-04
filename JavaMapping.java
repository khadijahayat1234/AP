import java.util.*;
// A map contains values on the basis of key, i.e. key and value pair. 
// Each key and value pair is known as an entry. A Map contains unique keys.

class JavaMapping {
    public static void main(String args[])
    {   
        Map<Integer,String> map=new HashMap<Integer,String>();  
        
        // Key is Roll no and value is Name.
        // Adding key values to map.

        map.put(100,"Moira");  
        map.put(200,"Stevie");  
        map.put(300,"Alexis");    
        for(Map.Entry m:map.entrySet()){  
         System.out.println("Roll No : "+m.getKey()+", Name : "+m.getValue());  
        }
    }
}